package com.java.practice.abstraction;

public class BalanceInquiry extends ATMTransaction{

	public BalanceInquiry(double balance) {
		super(balance);
	}
	
	@Override
	void performTransaction() {
		
	}
	
	@Override
	void displayTransactionDetails() {
	        System.out.println("Transaction Type: Balance Inquiry");
	        System.out.println("Current Balance: " + balance);
	    }
}
