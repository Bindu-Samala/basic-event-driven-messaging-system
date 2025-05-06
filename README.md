# Basic Event-Driven Messaging System
# 🚀 Spring Boot + Kafka Producer-Consumer System

[![Kafka](https://img.shields.io/badge/Kafka-231F20?logo=apache-kafka&logoColor=white)](https://kafka.apache.org/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)
[![Docker](https://img.shields.io/badge/Docker-2496ED?logo=docker&logoColor=white)](https://www.docker.com/)

A complete event-driven system with **Spring Boot Kafka Producer/Consumer** and **Dockerized Kafka**.

---

## 🛠️ **1. Infrastructure Setup**

### **Start Zookeeper & Kafka**
```bash
# Zookeeper
docker run -d --name zookeeper \
  -p 2181:2181 \
  -e ZOOKEEPER_CLIENT_PORT=2181 \
  confluentinc/cp-zookeeper:7.5.0

# Kafka
docker run -d --name kafka \
  -p 9092:9092 \
  -e KAFKA_BROKER_ID=1 \
  -e KAFKA_ZOOKEEPER_CONNECT=zookeeper:2181 \
  -e KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://localhost:9092 \
  --link zookeeper \
  confluentinc/cp-kafka:7.5.0
