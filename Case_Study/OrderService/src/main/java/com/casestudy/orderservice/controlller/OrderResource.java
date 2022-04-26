package com.casestudy.orderservice.controlller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.orderservice.orders.Orders;
import com.casestudy.orderservice.orders.address.Address;
import com.casestudy.orderservice.orders.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderResource {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/all-orders")
	public List<Orders> getAllOrders(){
     
		List<Orders> orders=orderService.getAllOrders();
		
		return orders;
	}
	
	
	@PostMapping("/add-order")
	public void placeOrder(@RequestBody Orders orders) {
		orderService.placeOrder(orders);
	}
	
	@PostMapping("/{status}/{id}")
	public String chanceStatus(@PathVariable String status,@PathVariable int id)
	{
		
	  return orderService.chanceStatus(status, id);	
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteOrder(@PathVariable int id) {
		
		orderService.deleteOrder(id);
	}
	
	@GetMapping("/get-order-by-customerid/{customerId}")
	
	public Optional<Orders> getOrderByCustomerId(@PathVariable int customerId){
		Optional<Orders> orders=orderService.getOrderById(customerId);
		return orders;
	}
	
	@PostMapping("/add-address")
	public void storeAddress(Address address) {
		
		orderService.storeAddress(address);
	}
	
	@GetMapping("/getaddressbyid/{customerId}")
 	public Optional<Address> getAddressByCustomerId(int customerId){
 		
 		return orderService.getAddressByCustomerId(customerId);
 	}
	
	@GetMapping("/all-addresses")
 	public List<Address> getAllAddress(){
		
		List<Address> addresses=orderService.getAllAddress();
		
		return addresses;
	}
	
	@GetMapping("/get-order-by-orderid/{orderId")
 	public Optional<Orders> getOrderById(int orderId){
		
		return orderService.getOrderById(orderId);
	}
	
	@PostMapping("/ordered-items")
 	public void onlinePayment(Orders orders) {
		orderService.onlinePayment(orders);
	}

}
