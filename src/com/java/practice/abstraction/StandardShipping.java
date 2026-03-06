package com.java.practice.abstraction;

public class StandardShipping extends Shipping {
	
	private double standartShippingCost;

	public StandardShipping(double standartShippingCost) {
		super(standartShippingCost);
		this.standartShippingCost = standartShippingCost;
	}

	@Override
	void calculateShippingCost() {
		shippingCost  = standartShippingCost;
		System.out.println("Shipping Cost : "+shippingCost);
	}

	@Override
	void estimateDeliveryTime() {
		System.out.println("Estimate Time 2 Days");
	}

}
