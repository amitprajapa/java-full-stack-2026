package com.java.practice.inheritance;

public class OnlineOrder extends Order{
	private String paymentStatus; 
    private String deliveryStatus;
	public OnlineOrder(String orderId, String orderDate, String paymentStatus, String deliveryStatus) {
		super(orderId, orderDate);
		this.paymentStatus = paymentStatus;
		this.deliveryStatus = deliveryStatus;
	}
    
	public void displayOrderDetails() {
        displayOrder();
        System.out.println("Payment Status: " + paymentStatus);
        System.out.println("Delivery Status: " + deliveryStatus);
    }

}
