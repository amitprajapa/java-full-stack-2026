package com.java.practice.Insurance;

import java.util.Scanner;

public class InsurancePolicy {
	/* Take policy number, policy holder name, and policy amount. */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Policy Number : ");
		int policyNumber = sc.nextInt();
		
		System.out.println("Enter Policy Holder Name : ");
		String name = sc.next();
		
		System.out.println("Enter Policy Amount : ");
		double amount = sc.nextDouble();
		
		System.out.println("Policy Number : "+policyNumber+" \nPolicy Holder Name : "+name+" \nPolicy Amount : "+amount);
	}

}
