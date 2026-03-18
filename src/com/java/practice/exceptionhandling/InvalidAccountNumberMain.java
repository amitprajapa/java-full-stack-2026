package com.java.practice.exceptionhandling;

public class InvalidAccountNumberMain {
	public static void main(String[] args) {
		try {
			ValidateAcountNumber.validAcountNumber("998767655712");
		} catch (InvalidAccountNumber e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println("Invalid Input");
		}
	}

}
