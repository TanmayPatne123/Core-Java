package com.example.Microservice1.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TanmayController {
	
	
	
	
	
	@GetMapping("/course-info")
	public ResponseEntity<String> getCourseInfo()
	{
		String info="Tanmay Learning Telusko Springboot Course";
		return new ResponseEntity<String>(info,HttpStatus.OK);
	}
	
	
	
	

}
