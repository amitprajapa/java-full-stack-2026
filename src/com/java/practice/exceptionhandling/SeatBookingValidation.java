package com.java.practice.exceptionhandling;

public class SeatBookingValidation {
	
	public static void bookSeat(int requestedSeat) throws SeatCustomeException{
		int totalSeat = 300;
		if(requestedSeat > totalSeat) {
			throw new SeatCustomeException("The Requested Seat excceed from avilable seat");
		}
		System.out.println("Seat Book");
	}

}
