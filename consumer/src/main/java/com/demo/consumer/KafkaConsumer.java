package com.demo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	
	@KafkaListener(topics="my-topic",groupId="my-new-group")
	public void listen(String message) {
		System.out.println("Message received:"+message);
	}
	
	@KafkaListener(topics="spring-topic",groupId="spring-group1")
	public void listen(RiderLocation location) {
		System.out.println("Message received:"+location.getRiderId()+ " "+location.getLatitude()+" "+location.getLongitude());
	}

}
