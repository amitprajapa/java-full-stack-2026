package com.java.practice.banking;

public class AccountDetails {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	AccountDetails(int accountNumber, String accountHolderName, double balance){
		this.accountNumber = accountNumber;
		this.accountHolderName= accountHolderName;
		this.balance = balance;
	}
	
	void display() {
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Holder Name : "+accountHolderName);
		System.out.println("Balance : "+balance);
	}

}
