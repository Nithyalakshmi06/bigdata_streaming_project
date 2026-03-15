# Big Data Streaming Project

This project demonstrates real-time data processing using:

- Apache Kafka
- Apache Spark Structured Streaming
- Hadoop HDFS
- Python

Pipeline:

Python Producer → Kafka → Spark Streaming → HDFS → Spark SQL

The Python script generates fake website user activity logs which are streamed through Kafka and processed using Spark.
