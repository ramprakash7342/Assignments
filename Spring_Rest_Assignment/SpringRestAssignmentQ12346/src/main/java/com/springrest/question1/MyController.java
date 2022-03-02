package com.springrest.question1;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyController {

	@GetMapping("/hello")
	public String home() {
		return "Hello World";
	}
	
}
