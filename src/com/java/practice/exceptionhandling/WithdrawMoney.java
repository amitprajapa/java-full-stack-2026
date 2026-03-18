package com.java.practice.exceptionhandling;

public class WithdrawMoney {
	
	public static void withdraw(double balance, double amount) throws InsufficientBalanceException {
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance.");
		} else {
			balance = balance = amount;
			System.out.println("Withdraw Sucessfully");
			System.out.println("Remaining Balance: " + balance);
		}
	}

}
