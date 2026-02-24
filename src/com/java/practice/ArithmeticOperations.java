package com.java.practice;

import java.util.Scanner;

public class ArithmeticOperations {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter Second Number : ");
		double num2 = sc.nextDouble();
		
		System.out.println("============= Result =============");
		
		System.out.println("Addition of Two Number  : "+(num1 + num2));
		System.out.println("Subtraction of Two Number : " +(num1 - num2));
		System.out.println("Multiplication of Two Number : " +(num1 * num2));
		System.out.println("Divisin of Two Number : " +(num1 / num2));
		
	}
}
