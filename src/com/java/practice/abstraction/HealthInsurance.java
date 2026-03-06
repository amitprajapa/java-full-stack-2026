package com.java.practice.abstraction;

public class HealthInsurance extends InsurancePolicy{
	private double healtIterest = 3.1;
	
	HealthInsurance(String policyId, String policyHolderName){
		super(policyId,policyHolderName);
	}

	@Override
	void calculatePremium() {
		double premium = 100000 * healtIterest;
		System.out.println("Premium : "+premium);
		
	}

	@Override
	void displayPolicy() {
		System.out.println("Policy Type : Helath Insurance");
		System.out.println("Policy ID : "+policyId);
		System.out.println("Policy Holder Name : "+policyHolderName);
		
	}
	
	
	

}
