package com.assignment.question7;


import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="orders")
public class Order {


	@Id
	private long orderId;
	private String userName;
	private String itemName;
	private double amount;
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Order( long orderId,String userName, String itemName, double amount) {
		super();
		this.orderId=orderId;
		this.userName = userName;
		this.itemName = itemName;
		this.amount = amount;
	}


	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userName=" + userName + ", itemName=" + itemName + ", amount=" + amount
				+ "]";
	}
	
	
}
