ThisBuild / organization := "com.huponx.protogen"
ThisBuild / scalaVersion := "2.13.16"
// Overridden at publish time via the proto tag (without the leading v).
ThisBuild / version := sys.env.getOrElse("PROTOGEN_VERSION", "0.0.0-SNAPSHOT")

// Keep in sync with SCALAPB_VERSION in protos/scripts/install-scalapb.sh.
val scalapbVersion = "0.11.17"
val grpcVersion = "1.69.1"

lazy val root = (project in file("."))
  .settings(
    name := "protogen-scala",
    libraryDependencies ++= Seq(
      "com.thesamet.scalapb" %% "scalapb-runtime" % scalapbVersion,
      "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapbVersion,
      "io.grpc" % "grpc-stub" % grpcVersion,
      "io.grpc" % "grpc-protobuf" % grpcVersion
    )
  )
