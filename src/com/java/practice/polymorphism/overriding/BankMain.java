package com.java.practice.polymorphism.overriding;

public class BankMain {
	public static void main(String[] args) {
		
		BankAccount savings = new SavingsAccount(100000);
        BankAccount current = new CurrentAccount(50000);

        System.out.println("Savings Account Details:");
        savings.displayDetails();

        System.out.println("\nCurrent Account Details:");
        current.displayDetails();
    }
	

}
