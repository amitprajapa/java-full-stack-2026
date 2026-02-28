package com.java.practice.polymorphism.overloading;

public class InsuranceSystem {
	double calculatePremium(double premium) {
		return premium;
	}
	
	double calculatePremium(int age , String policyType,double premium) {
		if(age > 25) {
			premium +=2000;
		} 
		
		if(policyType.equalsIgnoreCase("IPD")) {
			premium +=3000;
		}
		return premium;
		
	}
	
	double calculatePremium(int age , String policyType,double basePremium, double coverageAmount) {
		double premium = calculatePremium(age, policyType, basePremium);
		premium += coverageAmount * 0.01;
		return premium;
	}

}
