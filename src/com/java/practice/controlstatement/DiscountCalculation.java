package com.java.practice.controlstatement;

import java.util.Scanner;

public class DiscountCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Purchase Amount: ");
        double price = sc.nextDouble();
        
        if(price <= 1000) {
        	System.out.println("10% Discount Applied");
        } else if(price <= 500) {
        	System.out.println("5% Discount Applied");
        } else if(price >= 1200) {
        	System.out.println("20% Discount Applied");
        }
        
	}

}
