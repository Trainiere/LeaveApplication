package com.leave.listner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ConsumerListener {
	@KafkaListener(topics="SampleTopic", groupId = "group1")
	public void listen(String message) {
		System.out.println("Received --- " + message);
	}
}
