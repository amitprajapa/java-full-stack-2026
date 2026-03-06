package com.java.practice.abstraction;

public class VehicleInsurance extends InsurancePolicy{
	double in = 4.8;

	public VehicleInsurance(String policyId, String policyHolderName) {
		super(policyId, policyHolderName);
	}

	@Override
	void calculatePremium() {
		double premium = 200000 * in;
		System.out.println("Premium : "+premium);
		
	}

	@Override
	void displayPolicy() {
		System.out.println("Policy Type : Vehicle Insurance");
		System.out.println("Policy ID : "+policyId);
		System.out.println("Policy Holder Name : "+policyHolderName);
		
	}

}
