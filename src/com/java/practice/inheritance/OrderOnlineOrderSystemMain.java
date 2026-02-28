package com.java.practice.inheritance;

import java.util.Scanner;

public class OrderOnlineOrderSystemMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Order ID: ");
        String orderId = sc.nextLine();

        System.out.print("Enter Order Date: ");
        String orderDate = sc.nextLine();

        System.out.print("Enter Payment Status: ");
        String paymentStatus = sc.nextLine();
        
        System.out.print("Enter Delivery Status: ");
        String deliveryStatus = sc.nextLine();

        OnlineOrder order =
                new OnlineOrder(orderId, orderDate, paymentStatus, deliveryStatus);

        System.out.println("\n--- Order Details ---");
        order.displayOrderDetails();

        sc.close();
	}

}
