package com.java.practice.polymorphism.overloading;

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		System.out.println(account.calculateBalanace(50000));
		System.out.println(account.calculateBalanace(5000, 2000));
		System.out.println(account.calculateBalanace(5000, 2000,3.3));
	}

}
