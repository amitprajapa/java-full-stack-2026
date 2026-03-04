package com.java.practice.constructor;

public class ProductClass {
	private int id;
	private String productName;
	private double price;
	
	public ProductClass(int id, String productName, double price) {
		this.id = id;
		this.productName = productName;
		this.price = price;
	}
	
	void display() {
		System.out.println("Id : "+id);
		System.out.println("Product Name : "+productName);
		System.out.println("Product Price :"+price);
	}

}
