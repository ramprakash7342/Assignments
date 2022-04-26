package com.casestudy.orderservice.orders.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.casestudy.orderservice.orders.Orders;
import com.casestudy.orderservice.orders.address.Address;
import com.casestudy.orderservice.orders.repository.AddressRepository;
import com.casestudy.orderservice.orders.repository.OrderRepository;

public class OrderServiceImpl implements OrderService {

	private static int orderId;
	int customerId;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public List<Orders> getAllOrders() {
		
		return orderRepository.findAll();
	}


	@Override
	public void deleteOrder(int id) {
		 orderRepository.deleteById(id);
	}

	@Override
	public Optional<Orders> getOrderByCustomerId(int customerId) {
		
		return orderRepository.findByCustomerId(customerId);
	}

	@Override
	public void storeAddress(Address address) {
		 addressRepository.save(address);
	}

	@Override
	public Optional<Address> getAddressByCustomerId(int customerId) {
		
		return addressRepository.findByCustomerId(customerId);
	}

	@Override
	public List<Address> getAllAddress() {
		
		return addressRepository.findAll();
	}

	@Override
	public Optional<Orders> getOrderById(int orderId) {
		
		return orderRepository.findByOrderId(orderId);
	}


	

	@Override
	public String chanceStatus(String status, int id) {
	
		orderRepository.findById(id).get().setOrderStatus(status);
		return status;
	}


	


	@Override
	public void onlinePayment(Orders orders) {
		orderRepository.save(orders);
		
	}


	@Override
	public void placeOrder(Orders order) {
		orderRepository.save(order);
		
	}

}
