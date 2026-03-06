package com.java.practice.abstraction;

public class CurrentAccount extends BankAccount{
	private double interestRate = 2.2;

	CurrentAccount(String accountHolderName, Double balance) {
		super(accountHolderName, balance);
	}

	@Override
	void calculateInterest() {
		double interest = (balance * interestRate) / 100;
        System.out.println("Current Account Interest: " + interest);
	}

	@Override
	void displayAccountDetails() {
		 System.out.println("Account Type: Current");
	     System.out.println("Account Holder: " + accountHolderName);
	     System.out.println("Balance: " + balance);
	}

}
