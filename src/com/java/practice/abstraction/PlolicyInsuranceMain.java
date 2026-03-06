package com.java.practice.abstraction;

public class PlolicyInsuranceMain {
	public static void main(String[] args) {
		HealthInsurance healthInsurance = new HealthInsurance("PLI2112", "Amitkumar");
		VehicleInsurance insurance = new VehicleInsurance("VICL222", "Rahul");
		
		healthInsurance.displayPolicy();
		healthInsurance.calculatePremium();
		
		System.out.println("::::::::::::::::::::::::::::::::::");
		
		insurance.displayPolicy();
		insurance.calculatePremium();
	}

}
