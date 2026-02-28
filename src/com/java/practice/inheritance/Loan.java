package com.java.practice.inheritance;

public class Loan {
	private int loanId;
	private double loanAmount;
	private int tenure;
	
	public Loan(int loanId, double loanAmount, int tenure) {
		this.loanId = loanId;
		this.loanAmount = loanAmount;
		this.tenure = tenure;
	}
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	
	

}
