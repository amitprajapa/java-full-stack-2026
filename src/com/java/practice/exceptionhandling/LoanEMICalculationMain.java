package com.java.practice.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoanEMICalculationMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter Loan Amount: ");
            double loanAmount = sc.nextDouble();

            System.out.print("Enter Annual Interest Rate (%): ");
            double interestRate = sc.nextDouble();

            System.out.print("Enter Tenure (months): ");
            int tenure = sc.nextInt();

            LoanEMICalculator.calculateEMI(loanAmount, interestRate, tenure);
		} catch (InvalidTenureException e) {
			System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        }
	}

}
