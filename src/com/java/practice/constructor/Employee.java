package com.java.practice.constructor;

public class Employee {

	int id;
    String name;
    double salary;
    String department;
    
    public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
    
    public Employee(int id, String name, double salary, String department) {
		this(id,name);
		this.salary = salary;
		this.department = department;
	}
    
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}
