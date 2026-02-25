package com.java.practice.Ecommerce;

public class ProductDetails {
	private String productName;
	private double price;
	private int quantity;
	private double totalCost = 0.0;
	
	ProductDetails(String pN, double price, int q){
		this.productName = pN;
		this.price = price;
		this.quantity = q;
	}
	
	void totalCost() {
		totalCost = price * quantity;
	}
	
	void display() {
		System.out.println("Product Name: " + productName);
		System.out.println("Final Amount To Pay "+totalCost);
	}

}
