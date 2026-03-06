package com.java.practice.controlstatement;

import java.util.Scanner;

public class TransactionTotal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter transaction amount " + i + ": ");
            double amount = sc.nextDouble();
            total = total + amount;
        }

        System.out.println("Total Transaction Value: " + total);

        sc.close();
	}

}
