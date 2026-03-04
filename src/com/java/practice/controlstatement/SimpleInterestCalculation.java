package com.java.practice.controlstatement;

import java.util.Scanner;

public class SimpleInterestCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        if (principal > 0 && rate > 0 && time > 0) {

            double simpleInterest = (principal * rate * time) / 100;

            System.out.println("Simple Interest = " + simpleInterest);

        } else {
            System.out.println("Invalid input! All values must be positive.");
        }

	}

}
