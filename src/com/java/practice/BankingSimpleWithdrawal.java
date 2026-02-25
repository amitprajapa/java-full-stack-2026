package com.java.practice;

import java.util.Scanner;

public class BankingSimpleWithdrawal {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Current Balance : ");
		double currtBln = sc.nextDouble();
		System.out.println("withdrawal amount : ");
		double withdrawalAmt = sc.nextDouble();
		
		Banking1 b= new Banking1(currtBln, withdrawalAmt);
		b.subtract();
		b.display();
	}

}
