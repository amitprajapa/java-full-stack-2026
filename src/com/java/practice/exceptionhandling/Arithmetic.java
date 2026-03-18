package com.java.practice.exceptionhandling;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value a");
		
		int a = sc.nextInt();
		
		System.out.println("Enter value b");
		int b = sc.nextInt();
		try {
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("You can not divide by 0");
		} finally {
			System.out.println("Exception is raised and handled");
		}
		
	}

}
