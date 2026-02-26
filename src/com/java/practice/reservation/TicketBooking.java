package com.java.practice.reservation;

import java.util.Scanner;

public class TicketBooking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Tickets ");
		
		int numberOfTickts = sc.nextInt();
		
		System.out.println("Enter price ");
		int price = sc.nextInt();
		
		TicketDto dto = new TicketDto(numberOfTickts, price);
		dto.TotalBooking();
		dto.display();
		
	}

}
