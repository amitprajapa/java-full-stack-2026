package com.java.practice.constructor;

public class MainClass {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(482280001);
		BankAccount account1 = new BankAccount("Amit");
		BankAccount account2 = new BankAccount(3.87);
		account2.display();
		
		System.out.println(":::::::::::::::::::::::::::::::::::::");
		BankAccount1 ac = new BankAccount1();
		ac.displayAccountDetails();
		
		System.out.println(":::::::::::::::::::::::::::::::::::::");
		DefaultConstructor dc = new DefaultConstructor();
		dc.displayAccountDetails();
		
		System.out.println(":::::::::::::::::::::::::::::::::::::");
		
		BankAccount2 savingsAccount = new BankAccount2();
        savingsAccount.displayAccountDetails();

       
        
        BankAccount2 currentAccount = new BankAccount2(20000.0);
        currentAccount.displayAccountDetails();
        
        System.out.println("----------Finance Domain – Constructor Assignments--------");
        Loan loan = new Loan(232.87, 7.7, 24);
        loan.display();
        
        Calculator calculator = new Calculator(5000, 1.1, 36);
        calculator.calculateEmi();
        
        System.out.println(":::::::::::::::::::::::::::::::::::::");
        Product product = new Product(1, "Watch", 299.99);
        product.displayProductDetails();
        System.out.println(":::::::::::::::::::::::::::::::::::::");
        
        ProductClass class1 = new ProductClass(121, "Smart Phone ", 20000);
        class1.display();
        
        System.out.println(":::::::::::::::::::::::::::::::::::::");
        
        Employee employee = new Employee(101, "Amit", 50000, "IT");
        employee.display();

		
	}

}
