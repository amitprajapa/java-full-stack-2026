package com.java.practice.abstraction;

public abstract class BankAccount {
	
	protected String accountHolderName;
	protected Double balance;
	
	BankAccount(String accountHolderName, Double balance){
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	abstract void calculateInterest();
	
	abstract void displayAccountDetails();

}
