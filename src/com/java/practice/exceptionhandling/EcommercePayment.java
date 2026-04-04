package com.java.practice.exceptionhandling;

public class EcommercePayment {
	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService();
        double amount = 1500;

        int retryCount = 3;
        int attempt = 0;
        while (attempt < retryCount) {
            try {
                attempt++;
                System.out.println("\nAttempt " + attempt);

                paymentService.processPayment(amount);
                break;

            } catch (PaymentFailedException e) {
                System.out.println("Payment Failed: " + e.getMessage());

                if (attempt < retryCount) {
                    System.out.println("Retrying payment...");
                } else {
                    System.out.println("All retries failed. Please try later.");
                }

            } catch (ArithmeticException e) {
                System.out.println("Runtime Error occurred: " + e.getMessage());
                System.out.println("Please contact support.");
                break;
            }
        }
	}

}
