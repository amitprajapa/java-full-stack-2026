package com.java.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class BankingCustomerMain {
	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1, "Amit", "Saving", 25000));
		customers.add(new Customer(2, "Rahul", "Current", 20000));
		customers.add(new Customer(3, "Neha", "Savings", 5000));
        customers.add(new Customer(4, "Priya", "Current", 20000));
        customers.add(new Customer(5, "Karan", "Savings", 7000));
        
        for(Customer c : customers) {
        	c.display();
        	
        	System.out.println("=============================");
        }
        
        System.out.println("============Customer who have less 10000 =================");
        for(Customer c :customers) {
        	if(c.balance < 10000) {
        		c.display();
        	}
        }
        
        Iterator<Customer> it = customers.iterator();
        while(it.hasNext()) {
        	Customer c = it.next();
        	if(c.customerId == 2) {
        		it.remove();
        	}
        }
        
        for(Customer c : customers) {
        	c.display();
        	
        	System.out.println("=============================");
        }
	}

}
