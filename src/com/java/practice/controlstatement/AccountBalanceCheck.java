package com.java.practice.controlstatement;

import java.util.Scanner;

public class AccountBalanceCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter balance");
		
		double curentBa= sc.nextDouble();
		double wid = sc.nextDouble();
		if(curentBa <=0 ){
			System.out.println("Current Balance Can't Zero");
		}
		
		if(curentBa >= wid) {
			System.out.println("You Can withdrawal youre amount");
		}
	}
}
