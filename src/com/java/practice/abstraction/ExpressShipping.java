package com.java.practice.abstraction;

public class ExpressShipping extends Shipping{

	public ExpressShipping(double shippingCost) {
		super(shippingCost);
	}

	@Override
	void calculateShippingCost() {
		System.out.println("Shiping Cost : "+shippingCost);
		
	}

	@Override
	void estimateDeliveryTime() {
		System.out.println("Estimate Delivery : one week");
	}

}
