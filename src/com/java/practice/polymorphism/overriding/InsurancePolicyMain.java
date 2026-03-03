package com.java.practice.polymorphism.overriding;

public class InsurancePolicyMain {
	public static void main(String[] args) {
		InsurancePolicy health = new HealthInsurance("H101", "Rahul", 500000);
		InsurancePolicy vehicle = new VehicleInsurance("V101", "AMIT", 200000, "Two Wheeler");
		System.out.println("Health Insurance Policy Details:");
		health.display();

        System.out.println("\nVehicle Insurance Policy Details:");
        vehicle.display();
		
	}

}
