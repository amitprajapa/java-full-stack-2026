package com.java.practice.exceptionhandling;

public class TransactionInvalid extends Exception{

	TransactionInvalid(String message){
		super(message);
	}
}
