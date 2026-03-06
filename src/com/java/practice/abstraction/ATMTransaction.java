package com.java.practice.abstraction;

public abstract class ATMTransaction {
	protected double balance;

	public ATMTransaction(double balance) {
		this.balance = balance;
	}
	
	abstract void performTransaction();
	
	abstract void displayTransactionDetails();
	

}
