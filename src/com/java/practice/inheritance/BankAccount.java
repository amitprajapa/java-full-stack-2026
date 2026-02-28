package com.java.practice.inheritance;

public class BankAccount {
	private int accountNumber;
	private String holderName;
	private double balance;
	
	public BankAccount(int accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	void diposit(double amount) {
		balance +=amount;
	}
	
	void display() {
		System.out.println("Balance : "+ balance);
	}
	
	

}
