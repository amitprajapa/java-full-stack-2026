package com.java.practice.collection;

import java.util.LinkedHashSet;

public class InsuranceClaimIds {
	public static void main(String[] args) {
		LinkedHashSet<ClaimDto>  hashSet = new LinkedHashSet<ClaimDto>();
		
		hashSet.add(new ClaimDto("101","POL101",200000.0));
		hashSet.add(new ClaimDto("102","POL102",400000.0));
		hashSet.add(new ClaimDto("103","POL103",500000.0));
		System.out.println("Adding duplicate C102: " +hashSet.add(new ClaimDto("102", "POL9999", 20000)));
		
		  System.out.println("\nAll Claims:");
	        for (ClaimDto c : hashSet) {
	            System.out.println(c);
	        }
	        
	        ClaimDto rejected = new ClaimDto("C103", "P1003", 8000);
	        hashSet.remove(rejected);
	}

}
