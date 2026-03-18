package com.java.practice.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidTransactionAmountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter Amount: ");
            int amount = sc.nextInt();
            MakeTransaction.transaction(amount);

		} catch (TransactionInvalid e) {
			System.out.println("Error : "+e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input");
		} catch (Exception e) {
			System.out.println("some went wrong");
		}
	}

}
