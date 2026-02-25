package com.java.practice.finance;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principal Amount :");
		double principalAmount = sc.nextDouble();
		
		System.out.println("Enter Interest :");
		double interest = sc.nextDouble();
		
		System.out.println("Enter Time :");
		int time = sc.nextInt();
		
		SimpleInterestDetails details = new SimpleInterestDetails(principalAmount, interest, time);
		details.calculateSimpleInterest();
		details.display();
	}

}
