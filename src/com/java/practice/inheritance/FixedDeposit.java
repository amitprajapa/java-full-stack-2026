package com.java.practice.inheritance;

public class FixedDeposit extends Investment{
	private double interestRate;
	
	public FixedDeposit(double investmentAmount, int duration, double interestRate) {
		super(investmentAmount, duration);
		this.interestRate = interestRate;
	}
	
	public double calculateMaturityAmount() {
		return investmentAmount + (investmentAmount * interestRate * duration) / 100;
	}
	
	public void displayDetails() {
        System.out.println("Investment Amount: " + investmentAmount);
        System.out.println("Duration (Years): " + duration);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Maturity Amount: " + calculateMaturityAmount());
    }

	
	
}
