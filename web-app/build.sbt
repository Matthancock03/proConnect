name := """hello-play-backbone"""

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
    jdbc,
    anorm,
    javaEbean,
    javaJdbc,
    javaCore,
  "org.webjars" %% "webjars-play" % "2.2.0",
  "org.webjars" % "bootstrap" % "2.3.1",
  "org.mindrot"  % "jbcrypt"   % "0.3m",
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
  "org.twitter4j" % "twitter4j-core" % "3.0.3",
  "ws.securesocial" %% "securesocial" % "2.1.3"
)

play.Project.playJavaSettings
