package com.java.practice.abstraction;

public class DepositTransaction extends ATMTransaction{
	
	private double depositAmount;

	 DepositTransaction(double balance, double depositAmount) {
	        super(balance);
	        this.depositAmount = depositAmount;
	    }

	@Override
	void performTransaction() {
		balance = balance + depositAmount;
	}

	@Override
	void displayTransactionDetails() {
		System.out.println("Transaction Type: Deposit");
        System.out.println("Deposited Amount: " + depositAmount);
        System.out.println("Updated Balance: " + balance);
	}
	
	

}
