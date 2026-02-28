package com.java.practice.inheritance;

public class PremiumCustomer extends Customer{
	
	private String membershipType;
	private double discountPercentage;

	public PremiumCustomer(int customerId, String customerName, String contactNumber, String membershipType,
			double discountPercentage) {

		super(customerId, customerName, contactNumber);
		this.membershipType = membershipType;
		this.discountPercentage = discountPercentage;
	}

	public void displayDetailsWithDiscount() {
		displayCustomerDetails();
		System.out.println("Membership Type: " + membershipType);
		System.out.println("Discount Percentage: " + discountPercentage + "%");
	}

}
