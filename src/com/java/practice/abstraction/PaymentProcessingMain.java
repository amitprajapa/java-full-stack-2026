package com.java.practice.abstraction;

public class PaymentProcessingMain {
	public static void main(String[] args) {
		CardPayment cp = new CardPayment(299.23);
		UPIPayment upi = new UPIPayment(499.33);
		
		cp.makePayment(229.2);
		
		System.out.println("\n:::::::::::::::::::::::::::::::::::\n");
		
		upi.makePayment(399.9);
	}

}
