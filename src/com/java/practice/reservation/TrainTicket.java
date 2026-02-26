package com.java.practice.reservation;

public class TrainTicket {
	private String passengerName;
	private String trainName;
	private String seatNumber;
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	void display() {
		System.out.println("+++++++++++++ Passenger Details +++++++++++++");
		System.out.println("Passenger Name : "+passengerName);
		System.out.println("Train Name : "+trainName);
		System.out.println("Seat Number : "+seatNumber);
	}

}
