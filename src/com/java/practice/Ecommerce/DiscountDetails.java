package com.java.practice.Ecommerce;

public class DiscountDetails {
	private double productPrice;
	private double discountPercentage;
	private double discountAmount = 0.0;
	private double finalPrice = 0.0;
	
	DiscountDetails(double productPrice, double discountPercentage){
		this.productPrice = productPrice;
		this.discountPercentage = discountPercentage;
	}
	
	void calculateDiscountAmount() {
		discountAmount = productPrice * (discountPercentage / 100);
		finalPrice = productPrice - discountAmount;
	}
	
	void display() {
		System.out.println("Original price : "+productPrice);
		System.out.println("Discounted Price : "+discountAmount);
		System.err.println("Final Price : "+finalPrice);
	}

}
