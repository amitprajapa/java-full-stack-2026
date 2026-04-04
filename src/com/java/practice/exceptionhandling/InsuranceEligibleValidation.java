package com.java.practice.exceptionhandling;

public class InsuranceEligibleValidation {
	public static void checkAge(int age) throws PolicyNotEligibleException {
		if(age < 18) {
			throw new PolicyNotEligibleException("You are not eligible for the policy");
		} else {
			System.out.println("You Eligible For Policy");
		}
		
		
	}

}
