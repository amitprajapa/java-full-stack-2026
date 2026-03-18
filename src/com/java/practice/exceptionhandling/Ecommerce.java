package com.java.practice.exceptionhandling;

public class Ecommerce {
	
	public static void validation(double price , int q) throws ProductValidation{
		if(price == 0) {
			throw new ProductValidation("Product Price Can't be 0");
		} 
		if(q == 0) {
			throw new ProductValidation("Product Quantity Can't be 0");
		}
	}

}
