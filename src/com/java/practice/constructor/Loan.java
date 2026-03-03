package com.java.practice.constructor;

public class Loan {
	private double amount;
	private double interestRate;
	private int tenure;
	
	public Loan(double amount, double interestRate, int tenure) {
		this.amount = amount;
		this.interestRate = interestRate;
		this.tenure = tenure;
	}
	
	void display() {
		System.out.println("Amount : "+amount);
		System.out.println("Interest Rate : "+interestRate);
		System.out.println("Tenure : "+tenure);
	}
	

}
