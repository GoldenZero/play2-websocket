logLevel := Level.Warn

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("play" % "sbt-plugin" % "2.1.3")

addSbtPlugin("com.typesafe.sbt" % "sbt-pgp" % "0.8")
