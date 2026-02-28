package com.java.practice.inheritance;

public class HomeLoan extends Loan{
	private double interestRate;
	
	HomeLoan(int loanId, double loanAmount, int tenure,double interestRate){
		super(loanId,loanAmount,tenure);
		this.interestRate = interestRate;
		
	}
	
	double totalPayableAmount() {
		return getLoanAmount() + (getLoanAmount() * this.interestRate * getTenure());
	}


}
