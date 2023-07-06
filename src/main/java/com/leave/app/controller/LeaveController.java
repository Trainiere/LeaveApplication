package com.leave.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leave.producer.LeaveProducer;



@RestController
@RequestMapping("leave")
public class LeaveController {

	@Autowired
	private LeaveProducer producer;

	@GetMapping("/sendMsg/{employeeId}")

	public ResponseEntity<Integer> sendMsg(@PathVariable String employeeId) {
		producer.sendMessage(employeeId);
		HttpHeaders headers = new HttpHeaders();
		return ResponseEntity.ok().headers(headers).body(10);
	}
	
	public void sendMessage(String msg) {
		/*
		kafkaTemplate.send("SampleTopic", "Hello");
		kafkaTemplate.flush();
		kafkaTemplate.close();*/
	}
}
