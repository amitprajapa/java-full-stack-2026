package com.java.practice.polymorphism.overloading;

public class FinanceLoansystem {
	
	double calculateEMI(double loanAmount, int tenure){
		return loanAmount / tenure;
	}

	double calculateEMI(double loanAmount, double interestRate,int tenure) {
		return loanAmount * interestRate *(1 + interestRate);
	}
	
	double calculateEMI(double loanAmount, double interestRate) {
		return loanAmount + interestRate / 12;
	}
}
