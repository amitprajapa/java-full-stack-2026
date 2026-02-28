package com.java.practice.banking;

import java.util.Scanner;

public class FixedDeposit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Deposit Amount : ");
		double amount = sc.nextDouble();
		
		System.out.println("Enter Interest Rate : ");
		double rate = sc.nextDouble();
		
		double yearly = (amount * rate)/100 ;
		
		double interestEarn = yearly - amount;
		
		System.out.println("interest earned : "+yearly);
		
		 
	}
}
