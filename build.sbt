lazy val akkaContribExtra = project in file(".")

name := "akka-contrib-extra"

libraryDependencies ++= List(
  Library.akkaCluster,
  Library.akkaStream,
  Library.akkaTestkit % "test",
  Library.mockitoAll  % "test",
  Library.scalaTest   % "test"
)

resolvers += Resolver.patriknw
