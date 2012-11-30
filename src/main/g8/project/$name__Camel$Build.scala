import sbt._
import sbt.Keys._

object $name;format="Camel"$Build extends Build {

  lazy val $name;format="camel"$ = Project(
    id = "$name;format="norm"$",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "$name$",
      organization := "$organization$",
      version := "$version$",
      scalaVersion := "$scala_version$",
      libraryDependencies ++= Seq(
        // ORM
        "org.squeryl" %% "squeryl" % "0.9.5-4" cross CrossVersion.full,
        // test
        "org.specs2" %% "specs2" % "1.12.3" % "test"
      )
      // add other settings here
    )
  )
}
