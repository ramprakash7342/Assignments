package com.springrest.question3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControllerQuestion3 {

	@Autowired
	AddressService addressService;
	
	@GetMapping("/address")
	public List<AddressQuestion3> getAll() {
		
		return this.addressService.getAddress();
	}
	
	@GetMapping("/address/{zipcode}")
	public AddressQuestion3 getByZipcode(@PathVariable String zipcode) {
		return this.addressService.getAddress(Long.parseLong(zipcode));
	}
}
