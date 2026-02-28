package com.java.practice.inheritance;

import java.util.Scanner;

public class CustomerPremiumMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Contact Number: ");
        String contact = sc.nextLine();

        System.out.print("Enter Membership Type: ");
        String membership = sc.nextLine();

        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();
        
        PremiumCustomer customer = new PremiumCustomer(id, name, contact, membership, discount);

        System.out.println("\n--- Customer Details ---");
        customer.displayDetailsWithDiscount();

        sc.close();
	}

}
