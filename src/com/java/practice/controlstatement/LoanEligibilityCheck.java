package com.java.practice.controlstatement;

import java.util.Scanner;

public class LoanEligibilityCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();
        if (income >= 30000 && creditScore >= 700) {
            System.out.println("You are eligible for the loan.");
        } else {
            System.out.println("You are not eligible for the loan.");
        }

        sc.close();
	}

}
