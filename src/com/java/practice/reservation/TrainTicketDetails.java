package com.java.practice.reservation;

import java.util.Scanner;

public class TrainTicketDetails {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Passenger Name : ");
		String passengerName = sc.next();
		
		
		System.out.println("Enter Train Name : ");
		String trainName = sc.next();
		
		System.out.println("Enter Seat Number : ");
		String seatNumber = sc.next();
		
		TrainTicket ticket = new TrainTicket();
		ticket.setPassengerName(passengerName);
		ticket.setTrainName(trainName);
		ticket.setSeatNumber(seatNumber);
		ticket.display();
		
		sc.close();
		
	}

}
