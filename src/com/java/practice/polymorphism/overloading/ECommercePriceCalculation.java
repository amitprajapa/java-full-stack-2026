package com.java.practice.polymorphism.overloading;

public class ECommercePriceCalculation {
	
	double calculatePrice(double basePrice) {
		return basePrice;
	}
	
	double calculatePrice(double basePrice, double discount) {
		return basePrice - (basePrice * discount / 100);
	}
	
	double calculatePrice(double basePrice, double discount, double taxPer) {
	    double discountedPrice = basePrice - (basePrice * discount / 100);
	    return discountedPrice + (discountedPrice * taxPer / 100);
	}

}
