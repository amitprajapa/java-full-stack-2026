package com.java.practice.finance;

public class SimpleInterestDetails {
	
	private double principal;
	private double rateOfInterest;
	private int time;
	
	private double interestAmount = 0.0;
	
	public SimpleInterestDetails(double principal, double rateOfInterest, int time) {
		this.principal = principal;
		this.rateOfInterest = rateOfInterest;
		this.time = time;
	}
	
	void calculateSimpleInterest() {
		interestAmount = principal * rateOfInterest * time / 100;
	}
	
	void display() {
		System.out.println("Interest Amount : "+interestAmount);
	}
	

}
