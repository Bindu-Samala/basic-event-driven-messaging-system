package com.demo.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {
	
	@Bean
	public NewTopic createMyTopic() {
		return new NewTopic("spring-topic", 3, (short) 1);
	}
}
