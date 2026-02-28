package com.java.practice.inheritance;

import java.util.Scanner;

public class BankTransactionSystemMain {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Transaction ID: ");
	        int id = sc.nextInt();

	        System.out.print("Enter Amount: ");
	        double amount = sc.nextDouble();
	        sc.nextLine(); // consume newline

	        System.out.print("Enter Transaction Date: ");
	        String date = sc.nextLine();

	        System.out.print("Enter Payment Mode (UPI/Card/Net Banking): ");
	        String mode = sc.nextLine();

	        System.out.print("Enter Transaction Status: ");
	        String status = sc.nextLine();

	        OnlineTransaction transaction = new OnlineTransaction(id, amount, date, mode, status);

	        System.out.println("\n--- Transaction Details ---");
	        transaction.displayOnlineTransaction();

	        sc.close();
	}

}
