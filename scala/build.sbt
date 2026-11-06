ThisBuild / organization := "com.huponx.protogen"
ThisBuild / scalaVersion := "2.13.16"
// Overridden at publish time via the proto tag (without the leading v).
ThisBuild / version := sys.env.getOrElse("PROTOGEN_VERSION", "0.0.0-SNAPSHOT")

// Keep in sync with SCALAPB_VERSION in protos/scripts/install-scalapb.sh.
val scalapbVersion = "0.11.17"
val grpcVersion = "1.69.1"

// Internal registry (GitHub Packages). Published by generate.yml with GITHUB_ACTOR/GITHUB_TOKEN.
val githubPackages = "GitHub Package Registry" at "https://maven.pkg.github.com/huponx/protogen"

lazy val root = (project in file("."))
  .settings(
    name := "protogen-scala",
    publishMavenStyle := true,
    publishTo := Some(githubPackages),
    credentials ++= (for {
      user <- sys.env.get("GITHUB_ACTOR")
      token <- sys.env.get("GITHUB_TOKEN")
    } yield Credentials("GitHub Package Registry", "maven.pkg.github.com", user, token)).toSeq,
    // Scaladoc of generated code is slow and not needed.
    Compile / packageDoc / publishArtifact := false,
    libraryDependencies ++= Seq(
      "com.thesamet.scalapb" %% "scalapb-runtime" % scalapbVersion,
      "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapbVersion,
      "io.grpc" % "grpc-stub" % grpcVersion,
      "io.grpc" % "grpc-protobuf" % grpcVersion
    )
  )
