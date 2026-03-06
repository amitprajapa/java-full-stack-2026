package com.java.practice.abstraction;

public abstract class Shipping {
	
	protected double shippingCost;
	
	
	
	public Shipping(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	abstract void calculateShippingCost();
	
	abstract void estimateDeliveryTime();

}
