package com.java.practice.collection;

public class Account {
	
	String accountHolderName;
    double balance;
    String branch;

    public Account(String accountHolderName, double balance, String branch) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.branch = branch;
    }
    
    @Override
    public String toString() {
        return "Account{" +
                "name='" + accountHolderName + '\'' +
                ", balance=" + balance +
                ", branch='" + branch + '\'' +
                '}';
    }

}
