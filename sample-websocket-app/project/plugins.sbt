// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

//resolvers += "scct-github-repository" at "http://mtkopone.github.com/scct/maven-repo"

//addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")

