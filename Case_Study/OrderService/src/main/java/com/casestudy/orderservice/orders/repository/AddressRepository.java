package com.casestudy.orderservice.orders.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.orderservice.orders.address.Address;

@Repository
public interface AddressRepository extends MongoRepository<Address,Integer>{

	public Optional<Address> findByCustomerId(int customerId); 
}
