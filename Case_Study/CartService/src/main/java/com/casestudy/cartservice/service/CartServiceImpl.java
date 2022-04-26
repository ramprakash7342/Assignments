package com.casestudy.cartservice.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.casestudy.cartservice.entity.Cart;
import com.casestudy.cartservice.entity.Item;
import com.casestudy.cartservice.repository.CartRepository;
import com.casestudy.cartservice.repository.ItemRepository;

@Component
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;
	
	@Autowired 
	private ItemRepository itemRepository;
	
	@Override
	public void deleteItem(int id) {
		
		itemRepository.deleteById(id);
	}
	
	public void deleteAllItems() {
		
		itemRepository.deleteAll();
	}

	@Override
	public List<Item> getAllItems() {
		
		return itemRepository.findAll();
	}

	@Override
	public double ItemTotal() {
		
		List<Item> items =itemRepository.findAll();
		
		double total=0;
		for (Item item2 : items) {
			total=total+item2.getPrice();
		}
		
		return total;
	}

	@Override
	public Item addItem(Item item) {
		return  itemRepository.save(item);
	}

	@Override
	public void updateItem(int quantity, int id) {
		Item item=itemRepository.findById(id).get();
		
		item.setQuantity(quantity);
		
		itemRepository.save(item);
	}
	
	 public Cart updateCart(Cart cart,int cartId) {
		 
		 cartRepository.save(cart);
		 return cart;
	 }

	 public Cart getCartbyId(int cartId) {
		 
		 return cartRepository.findById(cartId).get();
	 }
	
}
