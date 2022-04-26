package com.casestudy.cartservice.entity;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CartItems")
public class Item {

	@Id
	private int itemId;
	private String productName;
	private double price;
	private int quantity;
	
	public Item() {
		super();
	}
	
	public Item(int itemId, String productName, double price, int quantity) {
		super();
		this.itemId = itemId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Items [productName=" + productName + ", price=" + price + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, productName, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(productName, other.productName) && quantity == other.quantity;
	}
	
	
	
}
