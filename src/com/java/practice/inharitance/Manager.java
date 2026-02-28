package com.java.practice.inharitance;

public class Manager extends Employee{
	
	private String deptName;
	private double bonus;
	
	public Manager(String empId, String empName, double empSal,String deptName, double bouns) {
		super(empId, empName, empSal);
		this.deptName = deptName;
		this.bonus = bouns;
	}

	public double getTotalSalary() {
		return getEmpSal() + bonus;
	}
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
