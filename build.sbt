name := "hello"

version := "0.1"

scalaVersion := "2.13.6"

resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"
val AkkaVersion = "2.6.14"
libraryDependencies +="com.typesafe.akka" %% "akka-actor" % AkkaVersion