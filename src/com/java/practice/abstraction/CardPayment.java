package com.java.practice.abstraction;

public class CardPayment extends Payment{

	public CardPayment(double amount) {
		super(amount);
	}

	@Override
	void makePayment(double amount) {
		System.out.println("Payment Done");
		System.out.println("Payment Make By Card");
		System.out.println("Amount : "+amount);
		
	}

}
