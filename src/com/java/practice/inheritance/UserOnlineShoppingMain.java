package com.java.practice.inheritance;

import java.util.Scanner;

public class UserOnlineShoppingMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Email ID: ");
        String email = sc.nextLine();

        System.out.print("Enter Delivery Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();
        
        ShoppingUser shoppingUser = new ShoppingUser(username, email, address, mobile);
        shoppingUser.displayProfile();
        sc.close();
	}

}
