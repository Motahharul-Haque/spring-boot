package com.dev.spring.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/")
	
	public String sayHello()
	{
		return "Hello World! The current time and date on server is "+LocalDateTime.now();
	}
}
