package com.java.practice.constructor;

public class BankAccount2 {
	private String accountType;
	private double balance;
	
	BankAccount2(){
		accountType = "Current Account";
		balance = 10000.00;
	}
	
	BankAccount2(double balance){
		this.balance = balance;
	}
	
	public void displayAccountDetails() {
        System.out.println("Account Type : " + accountType);
        System.out.println("Balance      : " + balance);
    }


}
