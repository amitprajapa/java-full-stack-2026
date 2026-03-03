package com.java.practice.polymorphism.overriding;

public class BankingInterestCalculation {
	protected  String bankName;
	protected  double interestRate;
	protected  int principal;
	protected  int timePeriod;
	protected  double interest;
	
	BankingInterestCalculation(String bankName, double interestRate, int princiapl, int timePeriod){
		this.bankName = bankName;
		this.interestRate = interestRate;
		this.principal = princiapl;
		this.timePeriod = timePeriod;
	}
	
	void calculateInterest() {
		interest = (this.principal * this.interestRate * this.timePeriod) / 100;
	}
	
	void displayDetails() {
		System.out.println("Bank Name : "+bankName);
		System.out.println("Bank Interest Rate : "+interestRate);
		System.out.println("Bank Principal Amount : "+principal);
		System.out.println("Bank Time Period : "+timePeriod);
		System.err.println("Interest For "+bankName+" : "+interest);
	}

}
