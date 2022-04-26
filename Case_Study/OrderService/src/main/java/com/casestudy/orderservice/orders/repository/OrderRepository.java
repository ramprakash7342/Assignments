package com.casestudy.orderservice.orders.repository;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.orderservice.orders.Orders;

@Repository
public interface OrderRepository extends MongoRepository<Orders,Integer>{

	public Optional<Orders> findByCustomerId(int customerId);
	public Optional<Orders> findByOrderId(int orderId);
}
