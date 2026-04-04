package com.java.practice.exceptionhandling;

public class PolicyNotEligibleExceptionMain {
	public static void main(String[] args) {
		try {
			InsuranceEligibleValidation.checkAge(16);
		} catch (PolicyNotEligibleException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
