scalaVersion := "2.11.1"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

name := "play2-websocket"

organization := "com.originate"

version := "1.0.5"

description  := "Scalable resilient to failures WebSocket/Socket.IO messaging module for Scala Play 2 for cloud environments."

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-remote" % "2.3.3"
)

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

net.virtualvoid.sbt.graph.Plugin.graphSettings

filterScalaLibrary := false

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

publishTo <<= version { (v: String) =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishMavenStyle := true

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>https://github.com/Originate/play2-websocket</url>
  <licenses>
    <license>
      <name>The Apache Software License, Version 2.0</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:Originate/play2-websocket.git</url>
    <connection>scm:git@github.com:Originate/play2-websocket.git</connection>
  </scm>
  <developers>
    <developer>
      <id>dtarima</id>
      <name>Denis Tarima</name>
      <url>http://originate.com</url>
    </developer>
  </developers>
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)
