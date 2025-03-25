ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.5"

lazy val root = (project in file("."))
  .settings(
    name := "zio-http-unused-local-definition",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "2.1.16",
      "dev.zio" %% "zio-http" % "3.1.0",
    ),
    scalacOptions ++= Seq(
      "-Wall",
    )
  )
