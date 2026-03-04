package com.java.practice.controlstatement;

import java.util.Scanner;

public class BankingMenu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        double balance = 1000; // initial balance

        System.out.println("----- Banking Menu -----");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance Enquiry");
        System.out.println("4. Exit");

        System.out.print("Select an option: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter amount to deposit: ");
                double deposit = sc.nextDouble();
                balance += deposit;
                System.out.println("Amount Deposited Successfully.");
                System.out.println("Current Balance: " + balance);
                break;

            case 2:
                System.out.print("Enter amount to withdraw: ");
                double withdraw = sc.nextDouble();
                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Amount Withdrawn Successfully.");
                } else {
                    System.out.println("Insufficient Balance.");
                }
                System.out.println("Current Balance: " + balance);
                break;

            case 3:
                System.out.println("Current Balance: " + balance);
                break;

            case 4:
                System.out.println("Thank you for using the banking system.");
                break;

            default:
                System.out.println("Invalid option selected.");
        }

        sc.close();
	}

}
