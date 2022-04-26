package com.casestudy.cartservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.casestudy.cartservice.entity.Cart;
import com.casestudy.cartservice.entity.Item;

@Service
public interface CartService {

	public void deleteItem(int id);
	public List<Item> getAllItems();
	public double ItemTotal();
	public Item addItem(Item item);
	public void deleteAllItems();
	public void updateItem(int quantity,int id);
	public Cart updateCart(Cart cart,int cartId);
	public Cart getCartbyId(int cartId);
}
