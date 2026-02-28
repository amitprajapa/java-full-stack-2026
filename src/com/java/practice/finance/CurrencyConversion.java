package com.java.practice.finance;

import java.util.Scanner;

public class CurrencyConversion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter INR Amount To convert USD : ");
		double inr = scanner.nextDouble();
		
		double currentDoller = 91.0;
		double usb = currentDoller * inr;
		
		System.out.println("The USD Amount of INR Is : "+usb);
	}

}
