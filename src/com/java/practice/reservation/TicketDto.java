package com.java.practice.reservation;

public class TicketDto {
	private int numberOfTickets;
	private int pricePerTickets;
	private int totalCost; 
	
	public TicketDto(int numberOfTickets, int pricePerTickets) {
		this.numberOfTickets = numberOfTickets;
		this.pricePerTickets = pricePerTickets;
	}
	
	void TotalBooking() {
		totalCost = numberOfTickets * pricePerTickets;
	}
	void display() {
		System.out.println("Total Cost of tickets : "+totalCost);
	}

}
