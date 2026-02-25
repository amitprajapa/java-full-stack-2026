package com.java.practice;

public class BankAccount {
	
	private String accountHolderName;
	private double balance = 0.0;
	
	public BankAccount(String accHName, double b) {
		this.accountHolderName = accHName;
		this.balance = b;
	}
	
	void deposit(double b) {
		balance = balance + b;
	}
	
	void display() {
		System.out.println("Account Holder : " + accountHolderName);
		System.out.println("Current Balance : " + balance);
	}

}
