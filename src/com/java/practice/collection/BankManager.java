package com.java.practice.collection;

import java.util.HashMap;
import java.util.Map;

public class BankManager {
	public static void main(String[] args) {
		HashMap<String, Account> accounts = new HashMap<>();
		
		accounts.put("ACC1001", new Account("Amit", 50000, "Mumbai"));
        accounts.put("ACC1002", new Account("Rahul", 30000, "Pune"));
        accounts.put("ACC1003", new Account("Sneha", 70000, "Delhi"));
        accounts.put("ACC1004", new Account("Priya", 45000, "Chennai"));
        accounts.put("ACC1005", new Account("Vikas", 25000, "Bangalore"));
        
        System.out.println("All Account Details:");
        for (Map.Entry<String, Account> entry : accounts.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
        
        String searchAcc = "ACC1003";
        if (accounts.containsKey(searchAcc)) {
            System.out.println("\nAccount Found: " + accounts.get(searchAcc));
        } else {
            System.out.println("\nAccount not found");
        }
        
        String depositAcc = "ACC1002";
        double depositAmount = 5000;

        if (accounts.containsKey(depositAcc)) {
            Account acc = accounts.get(depositAcc);
            acc.balance += depositAmount;
            System.out.println("\nAfter deposit in " + depositAcc + ": " + acc);
        }

        // Remove closed account
        String removeAcc = "ACC1005";
        accounts.remove(removeAcc);

	}

}
