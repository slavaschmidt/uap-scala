
name := "uap-scala"

organization := "ua-parser"

version := "0.1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.yaml" % "snakeyaml" % "1.10",
  "com.twitter" %% "util-collection" % "6.23.0",
  "org.specs2" %% "specs2-core" % "2.4.15" % "test"
)

unmanagedResourceDirectories in Compile += baseDirectory.value / "core"

includeFilter in (Compile, unmanagedResources) := "regexes.yaml"

unmanagedResourceDirectories in Test += baseDirectory.value / "core"

includeFilter in (Test, unmanagedResources) := "*.yaml"

// resolvers += Resolver.bintrayRepo("slavaschmidt", "maven")

bintrayOmitLicense := true

publishMavenStyle := true

// repository in bintray := "slavaschmidt-maven"

bintrayOrganization := None
  
sbtPlugin := false