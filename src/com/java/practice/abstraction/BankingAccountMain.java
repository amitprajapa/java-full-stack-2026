package com.java.practice.abstraction;

public class BankingAccountMain {
	public static void main(String[] args) {
		BankAccount acc1 = new SavingsAccount("Amit", 50000.0);
        BankAccount acc2 = new CurrentAccount("Rahul", 80000.0);

        acc1.displayAccountDetails();
        acc1.calculateInterest();

        System.out.println("-------------------");

        acc2.displayAccountDetails();
        acc2.calculateInterest();
	}

}
