package com.java.practice.inheritance;

import java.util.Scanner;

public class HomeLoadPayableMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Loan Id : ");
		int loanId = sc.nextInt();
		
		System.out.println("Enter Loan Amount: ");
		double loanAmount = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter Tenure : ");
		int tenure = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Interest Rate: ");
		double interestRate = sc.nextDouble();
		
		HomeLoan homeLoan = new HomeLoan(loanId, loanAmount, tenure, interestRate);
		System.out.println("Total Payable Amount : "+homeLoan.totalPayableAmount());
	}

}
