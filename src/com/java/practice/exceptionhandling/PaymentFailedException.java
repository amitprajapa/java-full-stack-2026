package com.java.practice.exceptionhandling;

public class PaymentFailedException extends Exception{
	
	PaymentFailedException(String message){
		super(message);
	}

}
