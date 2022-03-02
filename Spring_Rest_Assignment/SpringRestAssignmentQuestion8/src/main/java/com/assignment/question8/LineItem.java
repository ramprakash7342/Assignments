package com.assignment.question8;


public class LineItem {

		
	
	private int id;
	private int quantity;
	private Product product;
	
	public LineItem() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LineItem(int id, int quantity, Product product) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	@Override
	public String toString() {
		return "LineItem [id=" + id + ", quantity=" + quantity + ", product=" + product + "]";
	}
	
	
	
	
}
