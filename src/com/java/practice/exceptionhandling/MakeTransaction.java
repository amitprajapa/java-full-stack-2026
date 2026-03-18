package com.java.practice.exceptionhandling;

public class MakeTransaction {
	
	static int balance = 1000;
	public static void transaction(int amount) throws TransactionInvalid{
		if(amount <= 0) {
			throw new TransactionInvalid("Amount Should be greater than 0");
		} else if(amount <= balance) {
			System.out.println("Transaction Successfull");
		}
	}

}
