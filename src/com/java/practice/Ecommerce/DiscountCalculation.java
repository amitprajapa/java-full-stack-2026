package com.java.practice.Ecommerce;

import java.util.Scanner;

public class DiscountCalculation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Price : ");
		double productPrice = sc.nextDouble();
		
		System.out.println("Enter Discount Percentage. : ");
		double disPercentage = sc.nextDouble();
		
		DiscountDetails dd = new DiscountDetails(productPrice, disPercentage);
		dd.calculateDiscountAmount();
		dd.display();
		sc.close();
		
	}

}
