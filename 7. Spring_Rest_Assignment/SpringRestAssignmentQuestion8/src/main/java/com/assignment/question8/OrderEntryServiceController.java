package com.assignment.question8;

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
public class OrderEntryServiceController {

	@Autowired
	private OrderRepository orderRepository;
	
	
	@GetMapping("/order")
	public List<Order> getOrders(){
		return orderRepository.findAll();		
	}
	
	@GetMapping("/order/{id}")
	public Optional<Order> getOrder(@PathVariable int id)
	{
		return orderRepository.findById(id);
	}
	
	@PostMapping("/order")
	public String submitOrder(@RequestBody Order order) {
		orderRepository.insert(order);
		return "Submitted successfully";
	}
	
	@PutMapping("/update/{id}")
	public String updateOrder(@RequestBody Order order,@PathVariable int id) {
		Optional<Order> order1=orderRepository.findById(id);
		if(order1.isPresent()) {
			Order order2=order1.get();
			order2.setCustomer(order.getCustomer());
			order2.setDate(order.getDate());
			order2.setLineItem(order.getLineItem());
			order2.setTotal(order.getTotal());
			orderRepository.save(order2);
			return "Updated Successfully";
		}
		return "Order not Found";
	
	}
	
	@DeleteMapping("/order/{id}")
	public String deleteOrder(@PathVariable int id) {
		orderRepository.deleteById(id);
		return "Deleted Successfully";
	}
	
}
