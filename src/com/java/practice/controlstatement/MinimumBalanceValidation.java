package com.java.practice.controlstatement;

import java.util.Scanner;

public class MinimumBalanceValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter balance");
		double minimumBalance = 1000;
		double balance = sc.nextDouble();
		
		 if (balance < minimumBalance) {
	            System.out.println("Balance is below the minimum required balance.");
	        } else {
	            System.out.println("Balance is sufficient.");
	        }
	}

}
