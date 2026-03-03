package com.java.practice.constructor;

public class Calculator {
	private double principal;
	private double ir;
	private int tenure;

	public Calculator(double principal, double ir, int tenure) {
		this.principal = principal;
		this.ir = ir;
		this.tenure = tenure;
	}
	
	void calculateEmi(){
		double emi = (this.principal * ir * Math.pow(1 + ir, tenure))
                / (Math.pow(1 + ir, tenure) - 1);
		System.out.println("Monthly EMI : "+emi);
	}

}
