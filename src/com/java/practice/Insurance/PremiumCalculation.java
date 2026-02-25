package com.java.practice.Insurance;

import java.util.Scanner;

public class PremiumCalculation {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter base premium amount : ");
		double amnt = sc.nextDouble();
		double fixedServiceCharges = 40.8;
		
		double finalPremiumAmt = amnt + fixedServiceCharges;
		System.out.println("Final Premium Amount : "+finalPremiumAmt);
		
	}

}
