package com.springrestassignment.question9;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> fetchCustomerList() {
		
		return  (List<Customer>) customerRepository.findAll();
	}

	@Override
	public Customer updateCustomer(Customer customer, Long customertId) {
		
		Customer cusDB = customerRepository.findById(customertId).get();

		if (Objects.nonNull(customer.getCustomerName()) && !"".equalsIgnoreCase(customer.getCustomerName())) {
			cusDB.setCustomerName(customer.getCustomerName());
		}
		
		if (Objects.nonNull(customer.getCustomerMobile()) ) {
			cusDB.setCustomerMobile(customer.getCustomerMobile());
		}
		customerRepository.save(cusDB);
		
		return cusDB;
	}

	@Override
	public void deleteCustomerById(Long customerId) {
		customerRepository.deleteById(customerId);
	}

	@Override
	public Optional<Customer> fetchCustomerById(Long customerId) {
		return customerRepository.findById(customerId);	
	}

}
