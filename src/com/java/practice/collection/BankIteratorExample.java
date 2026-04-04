package com.java.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class BankIteratorExample {
	public static void main(String[] args) {
		
		ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(new Account("A101", 5000, "Amit"));
        accounts.add(new Account("A102", 800, "Rahul"));
        accounts.add(new Account("A103", 12000, "Sneha"));
        accounts.add(new Account("A104", 600, "Priya"));
        accounts.add(new Account("A105", 3000, "Vikas"));
        
        Iterator<Account> iterator = accounts.iterator();

        // Display all accounts
        System.out.println("All Accounts:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        iterator = accounts.iterator(); // reinitialize iterator

        while (iterator.hasNext()) {
            Account acc = iterator.next();
            if (acc.balance < 1000) {
                iterator.remove(); // SAFE removal
            }
        }
        
        System.out.println("\nAfter removing low balance accounts:");
        for (Account acc : accounts) {
            System.out.println(acc);
        }

	}

}
