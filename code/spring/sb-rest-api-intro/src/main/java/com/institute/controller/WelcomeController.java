package com.institute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome-rest-api")
	public String getWelcomeMsg() {
		return "Hello This is my First REST API";
	}
	
}
