package com.java.practice.polymorphism.overloading;

public class BankAccount {
	
	double calculateBalanace(double balance) {
		return balance;
	}
	
	double calculateBalanace(double balance,double deposit) {
		return balance + deposit;
	}
	
	double calculateBalanace(double balance, double deposit, double ir) {
		return balance + deposit + (deposit * ir/100);
	}

}
