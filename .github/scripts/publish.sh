#!/usr/bin/env bash
# Publish the stubs of every language that generated successfully.
#
# main is protected (everything goes through a PR), so this opens a PR with
# the new stubs, waits for it to be merged (auto-merge), then tags each
# successful language on the merge commit. A language that failed gets no tag
# and its directory is left untouched.
#
# Required env: PROTO_REF PROTO_DIR ARTIFACTS LANGS GH_TOKEN GITHUB_REPOSITORY
# Optional env: MAIN_BRANCH (main) WAIT_MINUTES (45) PROTO_REPO
set -euo pipefail

: "${PROTO_REF:?}" "${PROTO_DIR:?}" "${ARTIFACTS:?}" "${LANGS:?}" "${GH_TOKEN:?}" "${GITHUB_REPOSITORY:?}"
MAIN_BRANCH="${MAIN_BRANCH:-main}"
WAIT_MINUTES="${WAIT_MINUTES:-45}"

# shellcheck source=/dev/null
. "${PROTO_DIR}/scripts/lib.sh"
go_layout "${PROTO_REF}"

mkdir -p result
rows="result/rows.tsv"   # lang<TAB>status<TAB>tag<TAB>note
: > "${rows}"
pr_url=""
commit=""
release_url=""

set_row() { # lang status tag note
  grep -v "^$1	" "${rows}" > "${rows}.tmp" || true
  mv "${rows}.tmp" "${rows}"
  printf '%s\t%s\t%s\t%s\n' "$1" "$2" "$3" "$4" >> "${rows}"
}
row_status() { awk -F'\t' -v l="$1" '$1==l{print $2}' "${rows}"; }

# stubs_unchanged <tag> <commit> <lang>: true when the generated files are identical.
# Build files (pom.xml, build.sbt, Cargo.toml) are ignored: they are edited by hand and
# a re-run must not fail only because they changed after the tag was created.
stubs_unchanged() {
  if [ "$3" = "go" ]; then
    # go/ holds only stubs plus go.mod/go.sum; later majors live in go/vN/ and are not ours.
    git diff --quiet "$1" "$2" -- "$(lang_root go)" ":(exclude,glob)$(lang_root go)/v[0-9]*/**"
  else
    git diff --quiet "$1" "$2" -- "$(stub_dir "$3")"
  fi
}

lang_tag() {
  if [ "$1" = "go" ]; then echo "${GO_TAG_PREFIX}/${PROTO_REF}"; else echo "$1/${PROTO_REF}"; fi
}

finalize() {
  local failed=0 lang st tag note
  # shellcheck disable=SC2154
  jq -R -s --arg ref "${PROTO_REF}" --arg pr "${pr_url}" --arg commit "${commit}" --arg release "${release_url}" '
    (split("\n") | map(select(length>0) | split("\t"))
      | map({key: .[0], value: {status: .[1], tag: .[2], note: .[3]}}) | from_entries) as $langs
    | {proto_ref: $ref, pr_url: $pr, commit: $commit, release_url: $release, langs: $langs,
       failed: [$langs | to_entries[] | select(.value.status != "success" and .value.status != "exists") | .key]}
  ' "${rows}" > result/result.json

  {
    echo "## Generate stubs"
    echo ""
    echo "proto \`${PROTO_REF}\`  PR: ${pr_url:-—}  commit: \`${commit:0:7}\`  release: ${release_url:-—}"
    echo ""
    echo "| Language | Result | Tag | Note |"
    echo "|---|---|---|---|"
  } >> "${GITHUB_STEP_SUMMARY:-/dev/null}"
  # Failed languages first.
  for pass in fail ok; do
    for lang in ${LANGS}; do
      st="$(row_status "${lang}")"; st="${st:-failure}"
      tag="$(awk -F'\t' -v l="${lang}" '$1==l{print $3}' "${rows}")"
      note="$(awk -F'\t' -v l="${lang}" '$1==l{print $4}' "${rows}")"
      case "${st}" in
        success|exists) [ "${pass}" = "ok" ] || continue ;;
        *) [ "${pass}" = "fail" ] || continue ;;
      esac
      case "${st}" in
        success|exists) echo "| ${lang} | ${st} | \`${tag:--}\` | ${note} |" >> "${GITHUB_STEP_SUMMARY:-/dev/null}" ;;
        *)
          failed=1
          echo "| **${lang}** | **FAILED, no tag** | — | ${note} |" >> "${GITHUB_STEP_SUMMARY:-/dev/null}"
          echo "::error title=${lang} failed::${lang} was not published for ${PROTO_REF}: ${note}"
          ;;
      esac
    done
  done
  return "${failed}"
}

# 1. Collect per-language results from the generate matrix.
ok_langs=""
for lang in ${LANGS}; do
  rf="${ARTIFACTS}/result-${lang}/result.json"
  if [ -f "${rf}" ] && [ "$(jq -r .status "${rf}")" = "success" ] && [ -f "${ARTIFACTS}/stubs-${lang}/stubs.tar" ]; then
    ok_langs="${ok_langs} ${lang}"
    set_row "${lang}" "pending" "" ""
  else
    note="$(jq -r '.note // empty' "${rf}" 2>/dev/null || true)"
    set_row "${lang}" "failure" "" "${note:-generate job did not succeed}"
  fi
done

if [ -z "${ok_langs}" ]; then
  echo "no language generated successfully"
  finalize || true
  exit 1
fi

git config user.name "github-actions[bot]"
git config user.email "41898282+github-actions[bot]@users.noreply.github.com"
git fetch --quiet origin "${MAIN_BRANCH}"
git fetch --quiet --tags --force

# 2. Branch with the new stubs of the successful languages.
branch="generate/${PROTO_REF}"
git checkout -q -B "${branch}" "origin/${MAIN_BRANCH}"
roots=""
for lang in ${ok_langs}; do
  clean_stubs . "${lang}"
  tar -xf "${ARTIFACTS}/stubs-${lang}/stubs.tar"
  roots="${roots} $(lang_root "${lang}")"
done
# shellcheck disable=SC2086
git add -A -- ${roots}

if git diff --cached --quiet; then
  echo "no stub changes; tagging ${MAIN_BRANCH} HEAD"
  commit="$(git rev-parse "origin/${MAIN_BRANCH}")"
else
  git commit -q -m "chore: generate from proto@${PROTO_REF} (${ok_langs# })"
  git push --force-with-lease origin "${branch}" 2>/dev/null || git push --force origin "${branch}"

  gh label create automerge --color 0E8A16 --description "Merge automatically when checks pass" 2>/dev/null || true
  pr="$(gh pr list --head "${branch}" --state open --json number --jq '.[0].number // empty')"
  if [ -z "${pr}" ]; then
    gh pr create --base "${MAIN_BRANCH}" --head "${branch}" --label automerge \
      --title "chore: generate from proto@${PROTO_REF}" \
      --body "Generated by the generate workflow from \`${PROTO_REPO:-protos}\` at \`${PROTO_REF}\`. Languages: ${ok_langs}." >/dev/null
    pr="$(gh pr list --head "${branch}" --state open --json number --jq '.[0].number')"
  else
    gh pr edit "${pr}" --add-label automerge >/dev/null
  fi
  pr_url="$(gh pr view "${pr}" --json url --jq .url)"
  echo "PR: ${pr_url}"
  # Auto-merge waits for required checks; falls back to an immediate merge
  # when the branch has no required checks.
  gh pr merge --auto --squash "${pr}" 2>/dev/null || gh pr merge --squash "${pr}" 2>/dev/null || true

  # 3. Wait for the merge.
  deadline=$(( $(date +%s) + WAIT_MINUTES * 60 ))
  state=""
  while :; do
    info="$(gh pr view "${pr}" --json state,mergeCommit)"
    state="$(jq -r .state <<< "${info}")"
    if [ "${state}" = "MERGED" ]; then
      commit="$(jq -r .mergeCommit.oid <<< "${info}")"
      break
    fi
    if [ "${state}" = "CLOSED" ] || [ "$(date +%s)" -ge "${deadline}" ]; then
      break
    fi
    sleep 20
  done
  if [ "${state}" != "MERGED" ]; then
    for lang in ${ok_langs}; do
      set_row "${lang}" "failure" "" "PR ${pr_url} not merged (state ${state}); stubs not published"
    done
    finalize || true
    exit 1
  fi
fi

# 4. Tag every successful language on the merge commit.
git fetch --quiet origin "${MAIN_BRANCH}"
git fetch --quiet --tags --force
for lang in ${ok_langs}; do
  tag="$(lang_tag "${lang}")"
  if git rev-parse -q --verify "refs/tags/${tag}" >/dev/null; then
    if stubs_unchanged "${tag}" "${commit}" "${lang}"; then
      set_row "${lang}" "exists" "${tag}" "tag already exists with identical stubs"
    else
      set_row "${lang}" "failure" "${tag}" "tag exists but stubs differ; not moving it"
    fi
    continue
  fi
  git tag "${tag}" "${commit}"
  git push --quiet origin "refs/tags/${tag}"
  set_row "${lang}" "success" "${tag}" ""
done

# 5. Release for the common tag; notes list pass/fail per language.
if awk -F'\t' '$2=="success"||$2=="exists"{f=1} END{exit !f}' "${rows}"; then
  {
    echo "Generated from \`${PROTO_REPO:-protos}\` \`${PROTO_REF}\`."
    echo ""
    echo "| Language | Result | Tag |"
    echo "|---|---|---|"
    for lang in ${LANGS}; do
      st="$(row_status "${lang}")"
      tg="$(awk -F'\t' -v l="${lang}" '$1==l{print $3}' "${rows}")"
      echo "| ${lang} | ${st:-failure} | ${tg:--} |"
    done
  } > result/notes.md
  if gh release view "${PROTO_REF}" >/dev/null 2>&1; then
    gh release edit "${PROTO_REF}" --notes-file result/notes.md >/dev/null
  else
    gh release create "${PROTO_REF}" --target "${commit}" --title "${PROTO_REF}" --notes-file result/notes.md >/dev/null
  fi
  release_url="$(gh release view "${PROTO_REF}" --json url --jq .url)"
fi

finalize
