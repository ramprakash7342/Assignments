package com.springsecurity_question3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {


	@GetMapping("/user")
	public String home() {
		return "Hello World";
	}
	
}
