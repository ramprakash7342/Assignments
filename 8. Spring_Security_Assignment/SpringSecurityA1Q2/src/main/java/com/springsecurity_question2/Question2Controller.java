package com.springsecurity_question2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question2Controller {

	@GetMapping("/")
	public String greet() {
		return "Hello world";
	}
}
