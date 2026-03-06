package com.java.practice.abstraction;

public class ShippingMain {
	public static void main(String[] args) {
		StandardShipping st = new StandardShipping(30000);
		st.calculateShippingCost();
		st.estimateDeliveryTime();
		
		ExpressShipping es = new ExpressShipping(40000);
		es.calculateShippingCost();
		es.estimateDeliveryTime();
	}

}
