package com.java.practice.polymorphism.overriding;

public class CurrentAccount extends BankAccount{
	private double overdraftCharge = 500;

	public CurrentAccount(double balance) {
		super(balance);
	}
	
	@Override
	public double calculateInterest() {
		return -overdraftCharge;
	}
	
	

}
