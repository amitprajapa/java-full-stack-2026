package com.java.practice.inheritance;

public class Transaction {
	protected int transactionId;
	protected double amount;
	protected String date;
	
	public Transaction(int transactionId, double amount, String date) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.date = date;
	}
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public void displayTransaction() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date);
    }
	

}
