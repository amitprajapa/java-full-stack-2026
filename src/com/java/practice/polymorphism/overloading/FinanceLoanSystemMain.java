package com.java.practice.polymorphism.overloading;

public class FinanceLoanSystemMain {
	public static void main(String[] args) {
		FinanceLoansystem fl = new FinanceLoansystem();
		System.out.println(fl.calculateEMI(20000, 2.2));
		System.out.println(fl.calculateEMI(20000,2.2,24));
	}

}
