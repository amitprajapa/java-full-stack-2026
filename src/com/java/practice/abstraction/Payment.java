package com.java.practice.abstraction;

public abstract class Payment {
	protected double amount;
	
	public Payment(double amount) {
		this.amount = amount;
	}

	abstract void makePayment(double amount);
	

}
