package com.java.practice.constructor;

public class BankAccount {
	
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	BankAccount(int accountNumber){
		this.accountNumber = accountNumber;
	}
	
	BankAccount(String accountHolderName){
		this.accountHolderName = accountHolderName;
	}

	
	BankAccount(double balance){
		this.balance = balance;
	}
	
	void display() {
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Holder Name : "+accountHolderName);
		System.out.println("Account Balance : "+accountNumber);
	}

}
