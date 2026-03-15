# Big Data Streaming Project

This project demonstrates real-time data processing using:

- Apache Kafka
- Apache Spark Structured Streaming
- Hadoop HDFS
- Python

Pipeline:

Python Producer → Kafka → Spark Streaming → HDFS → Spark SQL

## Project Structure

bigdata_streaming
│
├ producer
│   └ log_producer.py
│
├ spark
│   └ kafka_stream.scala
│
├ screenshots
│   ├ kafka_topic.png
│   ├ spark_streaming.png
│   ├ hdfs_logs.png
│   └ sql_output.png
│
└ README.md

## Project Screenshots

### Kafka Topic Messages
![Kafka server](kafka_server.png)

### Spark Streaming Output
![Spark Streaming](screenshots/spark_streaming.png)

### HDFS Stored Logs
![HDFS Logs](screenshots/hdfs_logs.png)

### SQL Query Output
![SQL Output](screenshots/sql_output.png)
