lazy val scala212 = "2.12.12"
lazy val scala213 = "2.13.4"

scalaVersion := scala213
organization := "im.plmnt"
name := "mercator-cats"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
homepage := Some(url("http://github.com/implmnt/mercator-cats"))

crossScalaVersions := List(scala212, scala213)
scalafmtOnCompile := true
testFrameworks += new TestFramework("minitest.runner.Framework")
