lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """Scala neotypes Starter Project""",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.1",
    libraryDependencies ++= Seq(
      guice,
      "com.h2database" % "h2" % "1.4.199",
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
      //"com.dimafeng" % "neotypes_2.12" % "0.13.2",
      "com.dimafeng" %% "neotypes" % "0.13.2",
      "org.neo4j.driver" % "neo4j-java-driver" % "1.7.5"
    ),
    scalacOptions ++= Seq("-feature", "-deprecation", "-Xfatal-warnings")
  )
