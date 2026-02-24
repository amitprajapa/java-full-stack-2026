package com.java.practice;

import java.util.Scanner;

public class StudentMarksAverageCalculation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter marks of 3 subjects:");
		double m1 = sc.nextDouble();
		double m2 = sc.nextDouble();
		double m3 = sc.nextDouble();
		
		Student student = new Student(m1, m2, m3);
		student.displayMarks();
		sc.close();
		
		
		
		
	}

}
