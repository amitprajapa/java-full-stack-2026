package com.java.practice.exceptionhandling;

import java.util.Random;

public class PaymentService {
	public void processPayment(double amount) throws PaymentFailedException{
	 System.out.println("Processing payment of ₹" + amount + "...");
	 Random random = new Random();
     boolean isPaymentSuccessful = random.nextBoolean();
     if (!isPaymentSuccessful) {
         throw new PaymentFailedException("Payment gateway error!");
     }
     int test = amount > 1000 ? 10 / 0 : 10;

     System.out.println("Payment Successful!");
	}
}
