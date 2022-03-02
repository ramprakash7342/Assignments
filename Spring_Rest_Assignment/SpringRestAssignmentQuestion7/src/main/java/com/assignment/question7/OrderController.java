package com.assignment.question7;

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
public class OrderController {
	
	@Autowired 
	private OrderRepository orderRepository;
	
	@PostMapping("/placeOrder")
	public String saveOrder(@RequestBody Order order) {
		orderRepository.insert(order);
		return "Order Placed Successfully";
	}
	
	@GetMapping("/findAll")
	public List<Order> fetchAll(){
		return orderRepository.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteOrder(@PathVariable int id) {
		orderRepository.deleteById(id);
		return "Order Deleted Successfully";
	}
	
	@PutMapping("/update/{id}")
	public String updateOrder(@PathVariable int id,@RequestBody Order order) {
		Optional<Order> order1=orderRepository.findById(id);
		if(order1.isPresent()) {
			Order order2=order1.get();
			order2.setUserName(order.getUserName());
			order2.setItemName(order.getItemName());
			order2.setAmount(order.getAmount());
			orderRepository.save(order2);
			return "Updated Succeessfully";
		}
		return "Order Not Found";
	}
	
	@GetMapping("/find/{id}")
	public Optional<Order> findOne(@PathVariable int id) {
		return orderRepository.findById(id);
	}
	
}
