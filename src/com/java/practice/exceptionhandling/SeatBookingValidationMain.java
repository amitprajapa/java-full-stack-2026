package com.java.practice.exceptionhandling;

import java.util.Scanner;

public class SeatBookingValidationMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Seat reuired");
		int seat = sc.nextInt();
		try {
			SeatBookingValidation.bookSeat(seat);
		} catch (SeatCustomeException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
