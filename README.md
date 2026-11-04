# protogen

Stubs generated from the `protos` repo — every language and every service (`ping`, `bill`, …) in one repo.

```
go/           # module github.com/huponx/protogen
  ping/v1/
java/         # later
rust/
```

Go: `go get github.com/huponx/protogen@v0.2.0` then `import "github.com/huponx/protogen/ping/v1"`.

## CI

The [generate](.github/workflows/generate.yml) workflow:

- `repository_dispatch` (`proto_release`) or **Run workflow** with `proto_ref` (optional `proto_repo`)
- Checks out the proto repo at that tag → `protos/scripts/generate.sh` (`buf.gen.yaml` lives in **proto**) → `go mod tidy`
- Commits on diff → tag + GitHub Release using the **same** version as proto (no patch auto-bump)

On dispatch, proto’s notify workflow sends `proto_repo` (`github.repository`) and `proto_ref` in `client_payload`. Manual runs use the `proto_repo` input, then the `PROTO_REPO` variable, then `huponx/protos`. A public proto repo needs no extra read token.

Job outputs and summary: `proto_ref`, `proto_repo`, `tag`, `committed`, `skipped`, `release_url`.

## Local (monorepo)

```bash
make generate
```

Generation plugins live in the `protos` repo. `protogen` only stores stubs and publishes them.
