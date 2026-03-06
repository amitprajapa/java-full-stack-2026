package com.java.practice.abstraction;

public class UPIPayment extends Payment{

	public UPIPayment(double amount) {
		super(amount);
	}

	@Override
	void makePayment(double amount) {
		System.out.println("Payment Done");
		System.out.println("Payment Make By UPI");
		System.out.println("Amount : "+amount);
	}

}
