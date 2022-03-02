package com.springrestassignment.question9;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customers")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	
	@GetMapping("/customers/{id}")
	public Optional<Customer> getById(@PathVariable("id") Long customerId) {
		return customerService.fetchCustomerById(customerId);
	}
	
	@GetMapping("/customers")
	public List<Customer> getAll(){
		return customerService.fetchCustomerList();
	}
	
	@PutMapping("/customers/{id}")
	public Customer updateCustomer(@RequestBody Customer customer,@PathVariable("id") Long customerId)
	{
		return customerService.updateCustomer(customer, customerId);
	}
	
	@DeleteMapping("/customers/{id}")
	public String deleteById(@PathVariable Long customerId) {
		customerService.deleteCustomerById(customerId);
		return "Deleted Successfully";
	}

}
