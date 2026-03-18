package com.java.practice.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PremiumCalculationMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter Base Premium: ");
            double basePremium = sc.nextDouble();

            System.out.print("Enter Risk Factor: ");
            double riskFactor = sc.nextDouble();

            double premium = basePremium / riskFactor;

            System.out.println("Calculated Insurance Premium: " + premium);
			
		} catch (ArithmeticException e) {
			System.out.println("Error: Risk factor cannot be zero.");
		} catch (InputMismatchException e) {
			System.out.println("Error: Please enter valid numeric values.");
		} catch (Exception e) {
			System.out.println("Unexpected error occurred.");
		} 
		sc.locale();
	}

}
