package com.example.OAuthSecurityApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OAuthSecurityAppApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(OAuthSecurityAppApplication.class, args);
		System.out.println("This is OAuth Security");
	}

}
