package com.springrest.question6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerQuestion6 {

	@GetMapping("/addition/{num1}/{num2}")
	public int addition(@PathVariable Integer num1,@PathVariable Integer num2) {
		return num1+num2;
	} 
	
	@GetMapping("/subtraction/{num1}/{num2}")
	public int subtraction(@PathVariable Integer num1,@PathVariable Integer num2) {
		return num1-num2;
	}
	
	@GetMapping("/multiplication/{num1}/{num2}")
	public int multiplication(@PathVariable Integer num1,@PathVariable Integer num2) {
		return num1*num2;
	}
	
	@GetMapping("/division/{num1}/{num2}")
	public double division(@PathVariable Integer num1,@PathVariable Integer num2) {
		if(num2==0)
			return 0;
		return num1/num2;
	}
	
	@GetMapping("/square/{num1}")
	public int square(@PathVariable Integer num1) {
		
		return num1*num1;
	}
}
