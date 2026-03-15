from kafka import KafkaProducer
import time
import random

producer = KafkaProducer(
    bootstrap_servers='localhost:9092',
    value_serializer=lambda v: v.encode('utf-8')
)

users = ["user10","user20","user30","user40","user50"]
pages = ["home","products","cart","checkout","login"]

while True:
    log = random.choice(users) + " visited " + random.choice(pages)
    producer.send("website_logs", log)
    print(log)
    time.sleep(2)
