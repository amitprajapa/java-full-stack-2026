package com.java.practice.inharitance;

import java.util.Scanner;

public class BankInheritance {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Account Number: ");
	        int accNo = sc.nextInt();

	        System.out.print("Enter Account Holder Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Initial Balance: ");
	        double balance = sc.nextDouble();

	        System.out.print("Enter Interest Rate (%): ");
	        double rate = sc.nextDouble();
	        
	        SavingsAccount account = new SavingsAccount(accNo, name, balance, rate);
	        System.out.print("Enter Deposit Amount: ");
	        double deposit = sc.nextDouble();
	        account.diposit(deposit);

	        System.out.println("----------------------------");
	        account.display();
	        account.calculateAndDisplayInterest();

	        sc.close();
	}

}
