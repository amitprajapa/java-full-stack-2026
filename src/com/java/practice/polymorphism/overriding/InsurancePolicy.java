package com.java.practice.polymorphism.overriding;

public class InsurancePolicy {
	private String policyNumber;
	private String policyHolderName;
	
	public InsurancePolicy(String policyNumber, String policyHolderName) {
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
	}
	
	void display() {
		System.out.println("Policy Number: " + policyNumber);
        System.out.println("Policy Holder: " + policyHolderName);
	}
	

}
