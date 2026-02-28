package com.java.practice.polymorphism.overriding;

public class BankAccount {
	
	protected double balance;
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public double calculateInterest() {
		return 0;
	}
	
	public void displayDetails() {
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }

}
