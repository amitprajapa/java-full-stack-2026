package com.java.practice.abstraction;

public class ATMSystemMain {
	public static void main(String[] args) {
		DepositTransaction dt = new DepositTransaction(25000.0, 500.0);
		dt.performTransaction();
		dt.displayTransactionDetails();
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::");
		
		WithdrawTransaction wt = new WithdrawTransaction(3000.0, 1200);
		wt.performTransaction();
		wt.displayTransactionDetails();
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::");
		
		BalanceInquiry bq = new BalanceInquiry(30000);
		bq.displayTransactionDetails();
	}

}
