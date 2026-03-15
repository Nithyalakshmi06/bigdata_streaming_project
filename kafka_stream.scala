import org.apache.spark.sql.SparkSession

object KafkaStreamApp {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder
      .appName("Kafka Spark Streaming")
      .master("local[*]")
      .getOrCreate()

    val df = spark.readStream
      .format("kafka")
      .option("kafka.bootstrap.servers","localhost:9092")
      .option("subscribe","website_logs")
      .load()

    val messages = df.selectExpr("CAST(value AS STRING) as log")

    val query = messages.writeStream
      .outputMode("append")
      .format("parquet")
      .option("path","hdfs://localhost:9000/stream_logs")
      .option("checkpointLocation","/tmp/spark_checkpoint")
      .start()

    query.awaitTermination()
  }
}
