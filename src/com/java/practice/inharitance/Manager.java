package com.java.practice.inharitance;

public class Manager extends Employee{
	private String deptName;
	private double bonus;
	
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
