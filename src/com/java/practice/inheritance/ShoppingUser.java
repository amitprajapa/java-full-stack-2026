package com.java.practice.inheritance;

public class ShoppingUser extends User{
	private String deliveryAddress;
	private String mobileNumber;
	
	public ShoppingUser(String userName, String emailId, String deliveryAddress, String mobileNumber) {
		super(userName, emailId);
		this.deliveryAddress = deliveryAddress;
		this.mobileNumber = mobileNumber;
	}
	
	public void displayProfile() {
        displayUser();
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Mobile Number: " + mobileNumber);
    }

}
