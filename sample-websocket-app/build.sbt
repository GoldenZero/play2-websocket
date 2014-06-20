scalaVersion := "2.10.4"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

name := "sample-socketio-app"

organization := "com.originate"

version := "1.0"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % "0.7.0-M1",
  "com.typesafe.slick" %% "slick" % "2.0.2",
  "com.typesafe.akka" %% "akka-remote" % "2.3.3",
  "mysql" % "mysql-connector-java" % "5.1.26",
  "com.originate" %% "play2-websocket" % "1.0.4"
)

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

net.virtualvoid.sbt.graph.Plugin.graphSettings

filterScalaLibrary := false

lazy val root = (project in file(".")).enablePlugins(PlayScala)
