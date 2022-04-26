package com.casestudy.orderservice.cart;

import java.util.List;

public class Cart {

	private int cartId;
	private List<Items> items;
	private double totalPrice;
	
	public Cart() {
		super();
	}

	public Cart(int cartId, List<Items> items) {
		super();
		this.cartId = cartId;
		this.items = items;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		
		double price=0;
		for (Items items2 : items) {
			price=price+items2.getPrice()*items2.getQuantity();
		}
		
		this.totalPrice = price;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", itmes=" + items + ", totalPrice=" + totalPrice + "]";
	}
	
	
}
