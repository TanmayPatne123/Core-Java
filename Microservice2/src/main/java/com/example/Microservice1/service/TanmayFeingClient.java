package com.example.Microservice1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="MICROSERVICE1")
public interface TanmayFeingClient {
	
	
	@GetMapping("/course-info")
	public ResponseEntity<String> getCourseInfo();
	

}
