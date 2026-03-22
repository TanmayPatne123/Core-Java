package com.example.Microservice1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Microservice1.service.TanmayService;

@RestController
public class TanmayController {
	
	@Autowired
	private TanmayService service;
	
	@GetMapping("/course-details")
	public ResponseEntity<String> getCourseInfo()
	{
		String info=service.getCourseInfo();
		return new ResponseEntity<String>(info,HttpStatus.OK);
	}
	
	
	
	

}
