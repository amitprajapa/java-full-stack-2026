package com.java.practice.polymorphism.overriding;

public class VehicleInsurance extends HealthInsurance{
	private String vehicleType;

	public VehicleInsurance(String policyNumber, String policyHolderName, double coverageAmount, String vehicleType) {
		super(policyNumber, policyHolderName, coverageAmount);
		this.vehicleType = vehicleType;
	}
	
	@Override
	void display() {
		super.display();
		System.out.println("Policy Type: Vehicle Insurance");
        System.out.println("Vehicle Type: " + vehicleType);
	}

}
