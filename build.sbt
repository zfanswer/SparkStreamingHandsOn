name := "SparkStreamingHandsOn"

version := "0.1"

scalaVersion := "2.11.12"

val sparkVersion = "1.6.1"
val kafkaVersion = "1.1.0"

resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-streaming-kafka" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,
  "org.apache.kafka" %% "kafka" % kafkaVersion,
  "mysql" % "mysql-connector-java" % "5.1.6"
)

//assemblyMergeStrategy in assembly := {
//  case PathList("javax", "servlet", xs@_*) => MergeStrategy.first
//  case PathList(ps@_*) if ps.last endsWith ".properties" => MergeStrategy.first
//  case PathList(ps@_*) if ps.last endsWith ".xml" => MergeStrategy.first
//  case PathList(ps@_*) if ps.last endsWith ".types" => MergeStrategy.first
//  case PathList(ps@_*) if ps.last endsWith ".class" => MergeStrategy.first
//  case "application.conf" => MergeStrategy.concat
//  case "unwanted.txt" => MergeStrategy.discard
//  case x =>
//    val oldStrategy = (assemblyMergeStrategy in assembly).value
//    oldStrategy(x)
//}