package com.java.practice.polymorphism.overriding;

public class SavingsAccount extends BankAccount{
	private double interestRate = 4.0;

	public SavingsAccount(double balance) {
		super(balance);
	}
	
	@Override
	public double calculateInterest() {
		return balance * interestRate /100;
	}

}
