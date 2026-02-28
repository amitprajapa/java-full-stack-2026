package com.java.practice.inheritance;

public class OnlineTransaction extends Transaction {
	private String paymentMode;
	private String status;

	public OnlineTransaction(int transactionId, double amount, String date, String paymentMode, String status) {
		super(transactionId, amount, date);
		this.paymentMode = paymentMode;
		this.status = status;
		
	}

	public void displayOnlineTransaction() {
        displayTransaction();
        System.out.println("Payment Mode: " + paymentMode);
        System.out.println("Transaction Status: " + status);
    }
	

}
