package com.assignment.question8;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="order2")
public class Order {

	
	@Id
	private int id;
	private float total;
	private Date date;
	private Customer customer;
	private LineItem lineItem;
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Customer customer, LineItem lineItem, int id, float total, Date date) {
		super();
		this.customer = customer;
		this.lineItem = lineItem;
		this.id = id;
		this.total = total;
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public LineItem getLineItem() {
		return lineItem;
	}

	public void setLineItem(LineItem lineItem) {
		this.lineItem = lineItem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", lineItem=" + lineItem + ", id=" + id + ", total=" + total + ", date="
				+ date + "]";
	}
	
	
	
}
