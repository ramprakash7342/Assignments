package com.springsecurity_question1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

	@GetMapping("/")
	public String home() {
		return "This is public page";
	}
	
	@GetMapping("/user")
	public String user() {
		return "This is user page";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "This is admin page";
	}
}
