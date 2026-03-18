package com.java.practice.exceptionhandling;

public class ProductPriceValidationMain {
	public static void main(String[] args) {
		try {
			Ecommerce.validation(100, 0);
		} catch (ProductValidation e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexcepted Error");
		}
	}

}
