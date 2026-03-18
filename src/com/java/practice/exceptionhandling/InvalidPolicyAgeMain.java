package com.java.practice.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidPolicyAgeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter your age: ");
            int age = sc.nextInt();
            InsuranceApp.checkEligibility(age);
		} catch (InvalidAgeException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Error: Age must be a numeric value.");
		} catch (Exception e) {
			System.out.println("Unexpected error occurred.");
		}
		sc.close();
	}

}
