package com.example.Microservice1.service;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TanmayService {
	
	@Autowired
	private TanmayFeingClient feingClient;
	
	
	public String getCourseInfo() {
		
//		RestTemplate restTemplate = new	RestTemplate(); 
//		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8481/course-info",
//				String.class);
//		
//		return 	response.getBody()+ "Coming from another rest api";
		
		ResponseEntity<String> response = feingClient.getCourseInfo();
		return 	response.getBody()+ "Coming from another rest api";
		
	}
	
	

}
