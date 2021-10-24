val scala3Version = "3.0.2"

lazy val raft = project
  .in(file("raft"))
  .settings(
    name := "dist",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
