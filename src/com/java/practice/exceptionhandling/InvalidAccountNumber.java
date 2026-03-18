package com.java.practice.exceptionhandling;

public class InvalidAccountNumber extends Exception{
	InvalidAccountNumber(String message){
		super(message);
	}
}
