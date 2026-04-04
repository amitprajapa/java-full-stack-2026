package com.java.practice.collection;

public class Customer {
	 	int customerId;
	  	String name;
	    String accountType;
	    double balance;
	    
		public Customer(int customerId, String name, String accountType, double balance) {
			this.customerId = customerId;
			this.name = name;
			this.accountType = accountType;
			this.balance = balance;
		}
	    
	    void display() {
	    	System.out.println("Customer Id : "+customerId);
	    	System.out.println("Customer Name : "+name);
	    	System.out.println("Account Type : "+accountType);
	    	System.out.println("Balance : "+balance);
	    }
	    

}
