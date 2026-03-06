package com.java.practice.abstraction;

public abstract class InsurancePolicy {
	protected String policyId;
	protected String policyHolderName;
	
	
	
	public InsurancePolicy(String policyId, String policyHolderName) {
		this.policyId = policyId;
		this.policyHolderName = policyHolderName;
	}

	abstract void calculatePremium();
	
	abstract void displayPolicy();

}
