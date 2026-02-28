package com.java.practice;

import java.util.Scanner;

public class StudentPassFail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks : ");
		
		int marks = sc.nextInt();
		
		if(marks >= 40) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}
