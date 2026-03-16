package com.example.OAuthSecurityApp.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	

	@GetMapping("/getData")
	public String getCourse()
	{
		return "This is Java SpringBoot Course";
	}

}
