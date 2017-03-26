enablePlugins(ScalaJSPlugin)

lazy val commonSettings = Seq(
  organization := "com.lambdaminute",
  version := "0.0.1-SNAPSHOT"
)
scalaVersion := "2.12.1"

libraryDependencies ++=
  Seq(
    "org.scala-lang.modules" %%% "scala-parser-combinators" % "1.0.5"
  )

libraryDependencies ++= Seq(
    "org.typelevel" %%% "cats-macros",
    "org.typelevel" %%% "cats-kernel",
    "org.typelevel" %%% "cats-core"
  ).map(_ % "0.9.0")

lazy val core = RootProject(file("Frase"))
unmanagedSourceDirectories in Compile += baseDirectory.value / "Frase/src/main"
