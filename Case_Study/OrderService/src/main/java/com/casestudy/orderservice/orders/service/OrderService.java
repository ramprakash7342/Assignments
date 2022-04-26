package com.casestudy.orderservice.orders.service;

import java.util.List;
import java.util.Optional;


import com.casestudy.orderservice.orders.Orders;
import com.casestudy.orderservice.orders.address.Address;



public interface OrderService {

	public List<Orders> getAllOrders();
	public void placeOrder(Orders orders);
	public String chanceStatus(String status,int id);
	public void deleteOrder(int id);
	public Optional<Orders> getOrderByCustomerId(int customerId);
	public void storeAddress(Address address);
 	public Optional<Address> getAddressByCustomerId(int customerId);
 	public List<Address> getAllAddress();
// 	public Orders getOrderById(int orderId );
 	public Optional<Orders> getOrderById(int orderId);
 	public void onlinePayment(Orders orders);
	//void placeOrder(Cart cart);
}