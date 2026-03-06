package com.java.practice.abstraction;

public class WithdrawTransaction extends ATMTransaction{

	private double withdrawAmount;
	
	public WithdrawTransaction(double balance, double withdrawAmount) {
		super(balance);
		this.withdrawAmount = withdrawAmount;
	}

	@Override
	void performTransaction() {
		if(withdrawAmount <= balance) {
			balance = balance - withdrawAmount;
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	@Override
	void displayTransactionDetails() {
		System.out.println("Transaction Type: Withdraw");
        System.out.println("Withdraw Amount: " + withdrawAmount);
        System.out.println("Updated Balance: " + balance);
		
	}

}
