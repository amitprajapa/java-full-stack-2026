package com.java.practice.exceptionhandling;

public class LoanEMICalculator {
	public static void calculateEMI(double loanAmount, double annualRate, int tenure)
            throws InvalidTenureException {

        if (tenure <= 0) {
            throw new InvalidTenureException("Tenure must be greater than zero.");
        }

        double monthlyRate = annualRate / (12 * 100);

        double emi = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, tenure)) /
                     (Math.pow(1 + monthlyRate, tenure) - 1);

        System.out.println("Monthly EMI: " + emi);
    }


}
