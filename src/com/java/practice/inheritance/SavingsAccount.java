package com.java.practice.inheritance;

import java.util.Scanner;

public class SavingsAccount extends BankAccount{
		private double interestRate;
		private double balance;
		
		
		
		 public SavingsAccount(int accountNumber, String holderName, double balance, double interestRate) {
			super(accountNumber, holderName, balance);
			this.interestRate = interestRate;
			balance = balance;
		}



		 public void calculateAndDisplayInterest() {
		        double interest = balance * interestRate / 100;
		        System.out.println("Interest Amount: " + interest);
		    }
}
