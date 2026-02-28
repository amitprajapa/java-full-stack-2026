package com.java.practice.inheritance;

public class Customer {

	 protected int customerId;
	 protected String customerName;
	 protected String contactNumber;
	 
	 public Customer(int customerId, String customerName, String contactNumber) {
	        this.customerId = customerId;
	        this.customerName = customerName;
	        this.contactNumber = contactNumber;
	    }
	 public void displayCustomerDetails() {
	        System.out.println("Customer ID: " + customerId);
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Contact Number: " + contactNumber);
	    }
}
