package com.java.practice.exceptionhandling;

import java.util.Scanner;

public class Banking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			 System.out.print("Enter Account Balance: ");
	         double balance = sc.nextDouble();

	         System.out.print("Enter Withdrawal Amount: ");
	         double amount = sc.nextDouble();
	         WithdrawMoney.withdraw(balance, amount);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			 System.out.println("Invalid Input. Please enter numeric values.");
		}
		
		sc.close();
	}

}
