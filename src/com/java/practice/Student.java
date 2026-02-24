package com.java.practice;

public class Student {
	private double mark1;
	private double mark2;
	private double mark3;
	
	
	
	public Student(double mark1, double mark2, double mark3) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	public double getMark1() {
		return mark1;
	}
	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}
	public double getMark2() {
		return mark2;
	}
	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}
	public double getMark3() {
		return mark3;
	}
	public void setMark3(double mark3) {
		this.mark3 = mark3;
	}
	
	public double getTotal() {
		return mark1+mark2+mark3;
	}
	
	public double getAverage() {
		return getTotal()/3;
	}
	
	public void displayMarks() {
		System.out.println("Subject 1 Marks: " + mark1);
        System.out.println("Subject 2 Marks: " + mark2);
        System.out.println("Subject 3 Marks: " + mark3);
        System.out.println("Total Marks: " + getTotal());
        System.out.println("Average Marks: " + getAverage());
	}

}
