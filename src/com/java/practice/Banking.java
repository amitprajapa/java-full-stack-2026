package com.java.practice;

import java.util.Scanner;

public class Banking {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Account Holder Name : ");
		String accountHolderName = sc.nextLine();
		System.out.println("Enter Initial Balance : ");
		double balance = sc.nextDouble();
		
		BankAccount acc = new BankAccount(accountHolderName,balance);
		System.out.print("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();
        acc.deposit(depositAmount);
        acc.display();
		
	
		
		
	}

}
