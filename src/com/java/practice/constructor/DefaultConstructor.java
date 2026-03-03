package com.java.practice.constructor;

public class DefaultConstructor {
	private String accountType;
    private double balance;
	public DefaultConstructor() {
		accountType = "Savings";
        balance = 5000.0;
	}
    
	 public void displayAccountDetails() {
	        System.out.println("Account Type : " + accountType);
	        System.out.println("Balance      : " + balance);
	    }

}
