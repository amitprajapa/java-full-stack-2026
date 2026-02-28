package com.java.practice.banking;

import java.util.Scanner;

public class Account {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number : ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Account Holder Name : ");
		String accountHolderName = sc.nextLine();
		
		System.out.println("Balance : ");
		double balance = sc.nextDouble();
		
		AccountDetails accountDetails = new AccountDetails(accountNumber, accountHolderName, balance);
		accountDetails.display();
		sc.close();
	}

}
