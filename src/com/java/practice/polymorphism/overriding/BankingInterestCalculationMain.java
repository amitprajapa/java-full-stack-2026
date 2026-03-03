package com.java.practice.polymorphism.overriding;

public class BankingInterestCalculationMain {
	public static void main(String[] args) {
		BankingInterestCalculation bank1 =
                new HDFCBank("HDFC Bank", 7.7, 200000, 2);

        BankingInterestCalculation bank2 =
                new YesBank("Yes Bank", 8.85, 500000, 4);

        bank1.calculateInterest();
        bank1.displayDetails();

        System.out.println("================================");

        bank2.calculateInterest();
        bank2.displayDetails();
	}

}
