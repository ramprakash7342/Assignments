package com.springrestassignment.question9;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

	Customer saveCustomer( Customer customer);

	List<Customer> fetchCustomerList();

	 Optional<Customer>   fetchCustomerById(Long customerId);
	
	Customer updateCustomer(Customer  customer, Long  customertId);
	
	void deleteCustomerById(Long customerId);
}
