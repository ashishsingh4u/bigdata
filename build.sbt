name := "bigdata"

version := "0.1"

scalaVersion := "2.12.10"

val sparkVersion:String = "3.0.1"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-sql-kafka-0-10" % sparkVersion
)

//resolvers := List("Hortonworks Releases" at "http://nexus-private.hortonworks.com/nexus/content/groups/public/", "Jetty Releases" at "http://repo.hortonworks.com/content/repositories/jetty-hadoop/")

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  artifact.name + "_" + sv.binary + "-" + sparkVersion + "_" + module.revision + "." + artifact.extension
}