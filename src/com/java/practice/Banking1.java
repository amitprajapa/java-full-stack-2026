package com.java.practice;

public class Banking1 {
	private double currentBalance;
	private double withdrawalAmmount;
	private double remaingBalance;
	
	public Banking1(double currentBalance, double withdrawalAmmount) {
		this.currentBalance = currentBalance;
		this.withdrawalAmmount = withdrawalAmmount;
	}
	
	double subtract() {
		remaingBalance =  currentBalance - withdrawalAmmount;
		return remaingBalance;
	}
	void display() {
		System.out.println("Remaing Balance : "+remaingBalance);
	}
	

}
