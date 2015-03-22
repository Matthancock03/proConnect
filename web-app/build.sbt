name := """hello-play-backbone"""

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
    jdbc,
    anorm,
    javaJdbc,
    javaCore,
  "org.webjars" %% "webjars-play" % "2.2.0",
  "org.webjars" % "bootstrap" % "2.3.1",
  "org.mindrot"  % "jbcrypt"   % "0.3m"
)

play.Project.playJavaSettings
