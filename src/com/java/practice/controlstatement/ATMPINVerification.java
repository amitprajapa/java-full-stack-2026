package com.java.practice.controlstatement;

import java.util.Scanner;

public class ATMPINVerification {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ATM PIN ");
		String pin = sc.nextLine();
		String reqPin = "1234";
		if(pin.equals(reqPin)) {
			System.out.println("Right PIN");
		} else {
			System.out.println("Wrong PIN");
		}
		
	}

}
