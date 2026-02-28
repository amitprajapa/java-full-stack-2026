package com.java.practice.inheritance;

public class Investment {
	protected double investmentAmount;
    protected int duration;
    
	public Investment(double investmentAmount, int duration) {
		this.investmentAmount = investmentAmount;
		this.duration = duration;
	}
	public double getInvestmentAmount() {
		return investmentAmount;
	}
	public void setInvestmentAmount(double investmentAmount) {
		this.investmentAmount = investmentAmount;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	} 
    
    
}
