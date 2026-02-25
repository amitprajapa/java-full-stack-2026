package com.java.practice.Ecommerce;

import java.util.Scanner;

public class ProductPriceCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Name : ");
		String productName = sc.nextLine();
		
		System.out.println("Enter Product Price : ");
		double price = sc.nextDouble();

		System.out.println("Enter Product Quantity : ");
		int quantity = sc.nextInt();
		
		ProductDetails details = new ProductDetails(productName, price, quantity);
		details.totalCost();
		details.display();
		sc.close();
	}

}
