addSbtPlugin("org.scalameta"             % "sbt-scalafmt"    % "2.3.1")
addSbtPlugin("org.wartremover"           % "sbt-wartremover" % "2.4.3")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"    % "0.1.10")
addSbtPlugin("org.xerial.sbt"            % "sbt-sonatype"    % "3.8.1")
addSbtPlugin("com.jsuereth"              % "sbt-pgp"         % "2.0.1")

resolvers += Resolver.sonatypeRepo("public")
