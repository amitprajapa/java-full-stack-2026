package com.java.practice.collection;

import java.util.HashSet;

public class InsurancePolicyManager {
	public static void main(String[] args) {
		  HashSet<String> policies = new HashSet<>();
		  policies.add("POL101");
		  policies.add("POL102");
		  policies.add("POL103");
		  policies.add("POL104");
		  policies.add("POL105");
		  
		  System.out.println("Adding duplicate POL103 :"+policies.add("POL103"));
		  
		  for(String pol : policies) {
			  System.out.println(pol);
		  }
		  
		  String s = "POL101";
		  if(policies.contains(s)) {
			  System.out.println("\nPolicy "+s+" exists.");
		  }else {
			 System.out.println("\nPolicy not exists.");
		  }
		  String removePolicy = "POL1004";
	      policies.remove(removePolicy);
	      System.out.println("\nAfter removing " + removePolicy + ":");
	      System.out.println(policies);
	}

}
