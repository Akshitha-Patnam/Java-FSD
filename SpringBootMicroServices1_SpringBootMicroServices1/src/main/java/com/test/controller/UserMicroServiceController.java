package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.util.Logger;
import reactor.util.Loggers;

@RestController
public class UserMicroServiceController {
	
	//used to show errors
	protected Logger logger=Loggers.getLogger(UserMicroServiceController.class.getName());
	
	@GetMapping("/testuser")
	public String userTestService()
	{
		return "simple Microservice Application";
	}

	
}
