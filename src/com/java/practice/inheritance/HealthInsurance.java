package com.java.practice.inheritance;

public class HealthInsurance extends InsurancePolicy{
	private double hospitalCoverageLimit;
	
	HealthInsurance(String policyNumber, String policyHolderName, double policyAmount,double hospitalCoverageLimit){
		super(policyNumber, policyHolderName, policyAmount);
		this.hospitalCoverageLimit = hospitalCoverageLimit;
	}

	public double getHospitalCoverageLimit() {
		return hospitalCoverageLimit;
	}

	public void setHospitalCoverageLimit(double hospitalCoverageLimit) {
		this.hospitalCoverageLimit = hospitalCoverageLimit;
	}
	
	

}
