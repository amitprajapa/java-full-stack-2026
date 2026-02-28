package com.java.practice.inheritance;

import java.util.Scanner;

public class InvestmentFixedDepositMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Investment Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter Duration (in years): ");
        int years = sc.nextInt();

        System.out.print("Enter Interest Rate (%): ");
        double rate = sc.nextDouble();

        FixedDeposit fd = new FixedDeposit(amount, years, rate);

        System.out.println("\n--- Fixed Deposit Details ---");
        fd.displayDetails();
	}

}
