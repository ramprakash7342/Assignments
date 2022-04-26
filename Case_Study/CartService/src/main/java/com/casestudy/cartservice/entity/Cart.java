package com.casestudy.cartservice.entity;

import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Cart")
public class Cart {

	@Id
	private int cartId;
	private List<Item> items;
	private double totalPrice;
	
	public Cart() {
		super();
	}

	public Cart(int cartId, List<Item> items) {
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

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		
		double price=0;
		for (Item items2 : items) {
			price=price+items2.getPrice()*items2.getQuantity();
		}
		
		this.totalPrice = price;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", itmes=" + items + ", totalPrice=" + totalPrice + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cartId, items, totalPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		return cartId == other.cartId && Objects.equals(items, other.items)
				&& Double.doubleToLongBits(totalPrice) == Double.doubleToLongBits(other.totalPrice);
	}
	
	
}
