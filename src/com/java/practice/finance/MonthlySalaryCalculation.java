package com.java.practice.finance;

import java.util.Scanner;

public class MonthlySalaryCalculation {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Basic Salary: ");
	        double basicSalary = sc.nextDouble();

	        System.out.print("Enter Allowance Amount: ");
	        double allowance = sc.nextDouble();

	        System.out.print("Enter Tax Amount: ");
	        double tax = sc.nextDouble();

	        double finalSalary = basicSalary + allowance - tax;

	        System.out.println("---------------------------");
	        System.out.println("Final Monthly Salary: " + finalSalary);

	        sc.close();
	    }
	}