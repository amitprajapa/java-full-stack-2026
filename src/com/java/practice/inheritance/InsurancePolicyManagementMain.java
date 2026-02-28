package com.java.practice.inheritance;

import java.util.Scanner;

public class InsurancePolicyManagementMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Policy Number : ");
		String policyNumber = sc.next();
		
		System.out.println("Enter Policy Holder Name : ");
		String policyHolderName = sc.next();
		sc.nextLine();
		
		System.out.println("Enter Policy Amount : ");
		double policyAmt = sc.nextDouble();
		
		System.out.println("Enter Hospital Coverage Limit: ");
		double hospitalCL = sc.nextDouble();
		
		HealthInsurance hi = new HealthInsurance(policyNumber, policyHolderName, policyAmt, hospitalCL);
		System.out.println("Policy Number : "+hi.getPolicyNumber());
		System.out.println("Policy Holder Name : "+hi.getPolicyHolderName());
		System.out.println("Policy Amount : "+hi.getPolicyAmount());
		System.out.println("Policy Hospital Coverage Limit : "+hi.getHospitalCoverageLimit());
		
	}

}
