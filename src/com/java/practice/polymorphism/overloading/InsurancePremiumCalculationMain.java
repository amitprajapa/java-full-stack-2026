package com.java.practice.polymorphism.overloading;

public class InsurancePremiumCalculationMain {
	public static void main(String[] args) {
		InsuranceSystem insuranceSystem = new InsuranceSystem();
		System.out.println(insuranceSystem.calculatePremium(200000));
		System.out.println(insuranceSystem.calculatePremium(25, "IPD", 500000));
		System.out.println(insuranceSystem.calculatePremium(21, "OPD", 600000, 200000));
	}

}
