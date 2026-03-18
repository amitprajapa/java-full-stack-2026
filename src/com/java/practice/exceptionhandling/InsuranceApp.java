package com.java.practice.exceptionhandling;

public class InsuranceApp {
	
	public static void checkEligibility(int age) throws InvalidAgeException{
		if(age < 0) {
			throw new InvalidAgeException("Age cannot be negative.");
		}
		if (age < 18) {
            System.out.println("You are not eligible for an insurance policy.");
        } else {
            System.out.println("You are eligible to apply for an insurance policy.");
        }
	}

}
