package com.crudrepository.question9;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
     private long customerId;
     private String customerName;
     private long  customerMobile;
 
     
	public Customer() {
		super();
	}

	public Customer( String customerName, long customerMobile) {
		super();
		this.customerName = customerName;
		this.customerMobile = customerMobile;
	}


	public long getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public long getCustomerMobile() {
		return customerMobile;
	}


	public void setCustomerMobile(long customerMobile) {
		this.customerMobile = customerMobile;
	}
     
     
}
