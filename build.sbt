name := "bandolier"

version := "1.0"

scalaVersion := "2.10.3"

resolvers += "spray-repo" at "http://repo.spray.io"

libraryDependencies ++= Seq(
  "io.spray"          %% "spray-json" % "1.2.5"
)
