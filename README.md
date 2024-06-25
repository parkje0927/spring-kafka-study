## Kafka
### CLI
```markdown
- kafka-topics.sh
- kafka-console-producer.sh
- kafka-console-consumer.sh
- kafka-consumer-group.sh
- 예시) docker compose exec kafka1 kafka-topics.sh \ 
  --bootstrap-server localhost:9092,localhost:9093,localhost:9094 \
  --create --topic my-topic \
  --replication-factor 2 \ ==> 복제를 하겠다는 의미
  --partitions 1 ==> 한 번 늘리면 다시 줄일 수는 없다.
```

