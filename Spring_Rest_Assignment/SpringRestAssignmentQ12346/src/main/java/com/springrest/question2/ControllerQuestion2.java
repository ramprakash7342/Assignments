package com.springrest.question2;



import java.util.Map;
import java.util.TreeMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerQuestion2 {

	Map<String,String> map;
	
	@GetMapping("/all-user")
	public Map<String,String> getValue() {
		map=new TreeMap<>();
		map.put("ramprakash", "ram12345");
		map.put("monu", "monu12345");
		map.put("sanjay", "sanjay12345");
		map.put("mohit", "mohit12345");
		map.put("amit", "amit12345");
		return map;
	}
	
	@GetMapping("/validate/{username}/{password}")
	public String validation(@PathVariable String username,@PathVariable String password) {
	
	    if(getValue().containsKey(username)||getValue().containsValue(password))
		for(Map.Entry<String,String> mp:getValue().entrySet())
		{
			if(mp.getKey().equals(username)&& mp.getValue().equals(password))
				return "Valid User";
			else if(mp.getKey().equals(username))
				return "Invalid Password";
			else if(mp.getValue().equals(password))
				return "Invalid Username";
				
		}
		return "Invalid User";
	}
	
}
