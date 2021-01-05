addSbtPlugin("org.scalameta"             % "sbt-scalafmt"    % "2.4.2")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"    % "0.1.16")
addSbtPlugin("org.wartremover"           % "sbt-wartremover" % "2.4.13")
addSbtPlugin("org.xerial.sbt"            % "sbt-sonatype"    % "3.9.5")
addSbtPlugin("com.jsuereth"              % "sbt-pgp"         % "2.1.1")

resolvers += Resolver.sonatypeRepo("public")
