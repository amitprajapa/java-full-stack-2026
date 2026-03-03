package com.java.practice.polymorphism.overriding;

public class HealthInsurance extends InsurancePolicy{
	 private double coverageAmount;

	public HealthInsurance(String policyNumber, String policyHolderName, double coverageAmount) {
		super(policyNumber, policyHolderName);
		this.coverageAmount = coverageAmount;
	}
	
	@Override
	void display() {
		super.display();
		System.out.println("Policy Type: Health Insurance");
		System.out.println("Coverage Amount : "+coverageAmount);
	}

}
