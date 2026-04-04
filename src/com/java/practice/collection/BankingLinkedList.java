package com.java.practice.collection;

public class BankingLinkedList {
	int transactionId;
	String accountNumber;
	String transactionType;
	double amount;
	
	public BankingLinkedList(int transactionId, String accountNumber, String transactionType, double amount) {
		this.transactionId = transactionId;
		this.accountNumber = accountNumber;
		this.transactionType = transactionType;
		this.amount = amount;
	}
	
	void display()
	{
		System.out.println("Transaction Id : "+transactionId);
		System.out.println("Account Number : "+accountNumber);
		System.out.println("TransactionType : "+transactionType);
		System.out.println("Balanace :"+amount);
	}	
}
