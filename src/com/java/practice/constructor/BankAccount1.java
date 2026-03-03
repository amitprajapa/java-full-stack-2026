package com.java.practice.constructor;

public class BankAccount1 {
	
	private String accountType;
    private double balance;
    
    public BankAccount1() {
        accountType = "Savings";
        balance = 5000.00;
    }
    
    public void displayAccountDetails() {
        System.out.println("Account Type : " + accountType);
        System.out.println("Balance      : " + balance);
    }

}
