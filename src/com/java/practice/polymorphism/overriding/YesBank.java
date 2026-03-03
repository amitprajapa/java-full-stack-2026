package com.java.practice.polymorphism.overriding;

public class YesBank extends HDFCBank{

	YesBank(String bankName, double interestRate, int princiapl, int timePeriod) {
		super(bankName, interestRate, princiapl, timePeriod);
	}
	
	@Override
	void displayDetails() {
		interest = ((principal * interestRate * timePeriod) / 100) - 1000;
		System.out.println("Bank Name : "+bankName);
		System.out.println("Bank Interest Rate : "+interestRate);
		System.out.println("Bank Principal Amount : "+principal);
		System.out.println("Bank Time Period : "+timePeriod);
		System.err.println("Interest For "+bankName+" : "+interest);
	}

}
