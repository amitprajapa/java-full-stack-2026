package com.java.practice.polymorphism.overloading;

public class ECommercePriceCalculationMain {
	public static void main(String[] args) {
		ECommercePriceCalculation calculator = new ECommercePriceCalculation();
	    System.out.println("Base Price: " + calculator.calculatePrice(1000));

	    // Price with discount
	    System.out.println("Price after Discount: " +calculator.calculatePrice(1000, 10));

	    // Price with discount and tax
	    System.out.println("Price after Discount + Tax: " +calculator.calculatePrice(1000, 10, 18));
	}

}
