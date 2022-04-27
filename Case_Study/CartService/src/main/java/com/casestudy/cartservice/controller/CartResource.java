package com.casestudy.cartservice.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.cartservice.entity.Cart;
import com.casestudy.cartservice.entity.Item;
import com.casestudy.cartservice.service.CartService;

import io.swagger.v3.oas.annotations.Operation;


@RestController
@CrossOrigin
@RequestMapping("/cart")
public class CartResource {
	
	private Logger  logger=LoggerFactory.getLogger(CartResource.class);
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private RestTemplateCalls calls;
	
	@RequestMapping("/add-item-into-cart/{itemId}/{email}")
	@Operation(summary="It will add the item into the ItemRepositoy and update the cart")
	public Item addItem(Item item,@PathVariable int itemId,@PathVariable String email) {
		
		item =calls.getProductDetails(itemId);
		cartService.addItem(item);
		
		logger.info("Item is added in Item Repo");
		
	    Cart cart=new Cart();
	    
	    cart.setCartId(calls.getCartId(email));
	    cart.setItems(cartService.getAllItems());
	    cart.setTotalPrice(cartService.ItemTotal());
	    
	    cartService.updateCart(cart, cart.getCartId());
		
	    logger.info("Cart is updated after Item addition");
	    
		return item;
	}
	
	@GetMapping("/all-items")
	@Operation(summary="It will return all the items")
	public List<Item> getAllItems(){
		
		return cartService.getAllItems();
	}
	
	@RequestMapping("/update/{id}/{quantity}/{email}")
	public void updateItem(@PathVariable int quantity,@PathVariable int id,@PathVariable String email) {
		
		cartService.updateItem(quantity, id);
		logger.info("Item is updated in Item Repo");

	    Cart cart=new Cart();
	    
	    cart.setCartId(calls.getCartId(email));
	    cart.setItems(cartService.getAllItems());
	    cart.setTotalPrice(cartService.ItemTotal());
	    
	    cartService.updateCart(cart, cart.getCartId());
	    
	    logger.info("Cart is updated after Item Updation");
	}
	
	@GetMapping("/gettotal")
	public double ItemTotal() {
		return cartService.ItemTotal();
	}
	
	@DeleteMapping("/delete/{id}/{email}")
	public void deleteItem(@PathVariable int id,@PathVariable String email) {
		
		cartService.deleteItem(id);
		
		logger.info("Item is deleted from Item Repo");

	    Cart cart=new Cart();
	    
	    cart.setCartId(calls.getCartId(email));
	    cart.setItems(cartService.getAllItems());
	    cart.setTotalPrice(cartService.ItemTotal());
	    
	    cartService.updateCart(cart, cart.getCartId());
	    
	    logger.info("Cart is updated after Item deletion");
	}
	
	@DeleteMapping("/delete-all/{email}")
	public void deleteAllItems(@PathVariable String email) {
		
		cartService.deleteAllItems();
		logger.info("All Items are deleted from Item Repo");

	    Cart cart=new Cart();
	    
	    cart.setCartId(calls.getCartId(email));
	    cart.setItems(cartService.getAllItems());
	    cart.setTotalPrice(cartService.ItemTotal());
	    
	    cartService.updateCart(cart, cart.getCartId());
	    logger.info("Cart id Update after all Items deletion");
	}
	
	@GetMapping("/get-cart/{cartId}")
	public Cart getCartbyId(@PathVariable int cartId) {
		 
		 return cartService.getCartbyId(cartId);
	 }
	
	
}
