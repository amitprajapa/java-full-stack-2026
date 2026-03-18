package com.java.practice.exceptionhandling;

public class ValidateAcountNumber {
	
	public static void validAcountNumber(String number) throws InvalidAccountNumber {
		if(number.length() == 12) {
			System.out.println("Valid Account Number");
		} else {
			throw new InvalidAccountNumber("Invalid Acounnt Numbeer");
		}
	}

}
