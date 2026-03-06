package com.java.practice.controlstatement;

import java.util.Scanner;

public class CurrencyConversionSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Select Any one Choice to conert corrency");
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.println("3. INR to EUR");
        
        int n = sc.nextInt();
        
        switch (n) {
		case 1: 
			System.out.println("Enter INR Amount to convert USD");
			
			double inr = sc.nextDouble();
			double usd = inr * 91;
			System.out.println("After Converted :"+usd);
			break;
		case 2:
			System.out.println("Enter USD Amount to convert INR");
			
			double USD = sc.nextDouble();
			double indAmt = USD * 91.2;
			System.out.println("Amount in INR: " + indAmt);
			break;
		case 3:
			System.out.println("Enter INR Amount to convert EUR");
			double inr1 = sc.nextDouble();
			double rate = 0.0093;
			double eur = inr1 * rate;

			System.out.println("EUR: " + eur);
			break;
		default:
		}
        sc.close();
        
	}

}
