name := """hello-play-backbone"""

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
    jdbc,
    anorm,
    javaJdbc,
    javaCore,
  "org.webjars" %% "webjars-play" % "2.2.0",
  "org.webjars" % "bootstrap" % "2.3.1",
  "org.mindrot"  % "jbcrypt"   % "0.3m",
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
  "be.objectify" %% "deadbolt-java" % "2.2-RC5"
)

resolvers += Resolver.url("Objectify Play Repository", url("http://deadbolt.ws/releases/"))(Resolver.ivyStylePatterns)

play.Project.playJavaSettings
