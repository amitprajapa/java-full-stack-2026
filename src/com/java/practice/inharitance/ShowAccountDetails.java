package com.java.practice.inharitance;

import java.util.Scanner;

public class ShowAccountDetails {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		String empId = sc.nextLine();

		
		System.out.println("Enter Employee Name : ");
		String empName = sc.nextLine();
		
		System.out.println("Enter Employee Salary : ");
		double salary = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter Department Name : ");
		String deptName = sc.nextLine();
		
		System.out.println("Enter Bouns : ");
		int bouns = sc.nextInt();
		
		Manager manager = new Manager();
		
		manager.setEmpId(empId);
		manager.setEmpName(empName);
		manager.setEmpSal(salary);
		manager.setBonus(bouns);
		manager.setDeptName(deptName);
		
		
		System.out.println("Employee Id : " + manager.getEmpId());
		System.out.println("Employee Name : " + manager.getEmpName());
		System.out.println("Department : " + manager.getDeptName());
		System.out.println("Basic Salary : " + manager.getEmpSal());
		System.out.println("Bonus : " + manager.getBonus());
		System.out.println("Total Salary : " + manager.getTotalSalary());
		
	}

}
