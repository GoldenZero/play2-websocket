/*
   Copyright 2013 Originate Inc.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
import sbt._
import Keys._

object ApplicationBuild extends Build {

  val appDependencies = Seq(
    "com.typesafe.play" %% "play-slick" % "0.7.0-M1",
    "com.typesafe.slick" %% "slick" % "2.0.2",
    "com.typesafe.akka" %% "akka-remote" % "2.3.3",
    "mysql" % "mysql-connector-java" % "5.1.26",
    "com.originate" %% "play2-websocket" % "1.0.4"
  )

  lazy val main = project.in(file("."))
    .enablePlugins(play.PlayScala)
    .settings(
      resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
      name := "sample-websocket-app",
      organization := "com.originate",
      version := "1.0",
      libraryDependencies ++= appDependencies
    )

}
