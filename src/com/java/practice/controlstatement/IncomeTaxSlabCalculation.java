package com.java.practice.controlstatement;

import java.util.Scanner;

public class IncomeTaxSlabCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Annual Income: ");
        double income = sc.nextDouble();
        
        if(income <= 250000) {
        	System.out.println("Tax Percentage: 0%");
        } else if(income <= 500000) {
        	System.out.println("Tax Percentage: 5%");
        } else if(income <= 1000000) {
        	System.out.println("Tax Percentage: 20%");
        } else {
            System.out.println("Tax Percentage: 40%");
        }
	}
}
