package com.java.practice.collection;

import java.util.TreeSet;

public class InterestRateManager {
	public static void main(String[] args) {
		 TreeSet<Double> rates = new TreeSet<>();
		 rates.add(6.5);
	     rates.add(7.2);
	     rates.add(5.8);
	     rates.add(6.9);
	     rates.add(7.5);
	     System.out.println("Adding duplicate 6.5: " + rates.add(6.5));
	     
	     System.out.println("\nAll Interest Rates (Sorted):");
	        for (Double rate : rates) {
	            System.out.println(rate);
	        }
	        
	        System.out.println("\nLowest Rate: " + rates.first());
	        System.out.println("Highest Rate: " + rates.last());
	        
	        double searchRate = 6.9;
	        if (rates.contains(searchRate)) {
	            System.out.println("\nRate " + searchRate + " exists.");
	        } else {
	            System.out.println("\nRate " + searchRate + " does not exist.");
	        }
	        
	        double removeRate = 5.8;
	        rates.remove(removeRate);

	        System.out.println("\nAfter removing " + removeRate + ":");
	        System.out.println(rates);
	}

}
