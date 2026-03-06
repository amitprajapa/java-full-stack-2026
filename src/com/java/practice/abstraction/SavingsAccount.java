package com.java.practice.abstraction;

public class SavingsAccount extends BankAccount{
	private double interestRate = 4.0;

	SavingsAccount(String accountHolderName, Double balance) {
		super(accountHolderName, balance);
	}

	@Override
	void calculateInterest() {
		 double interest = (balance * interestRate) / 100;
	     System.out.println("Savings Account Interest: " + interest);
		
	}

	@Override
	void displayAccountDetails() {
		System.out.println("Account Type: Savings");
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
	}
	
	

}
