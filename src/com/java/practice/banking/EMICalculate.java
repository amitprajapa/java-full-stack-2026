package com.java.practice.banking;

import java.util.Scanner;

public class EMICalculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Loan Amount : ");
		double loanAmount = sc.nextDouble();
		
		System.out.println("Number of Months : ");
		int numberOfMonths = sc.nextInt();
		
		double emi = loanAmount / numberOfMonths;
		
		System.out.println("Monthly EMI : "+emi);
		
	}

}
