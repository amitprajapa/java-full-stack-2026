package com.java.practice.controlstatement;

import java.util.Scanner;

public class CreditTransaction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Purchase Amount: ");
        double purchaseAmount = sc.nextDouble();

        System.out.print("Enter Credit Limit: ");
        double creditLimit = sc.nextDouble();

        if (purchaseAmount <= creditLimit) {
            System.out.println("Transaction Approved");
        } else {
            System.out.println("Transaction Declined");
        }

        sc.close();
	}

}
