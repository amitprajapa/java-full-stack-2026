package com.java.practice.inheritance;

import java.util.Scanner;

public class ProductInfoMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product ID : ");
		int pid = sc.nextInt();
		
		System.out.println("Enter Product Name : ");
		String pName = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter Product Price : ");
		double pPrice = sc.nextDouble();
		
		System.out.println("Enter Product Warranty : ");
		int pWarranty = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Product Brand Name : ");
		String pBrand = sc.nextLine();
		
		
		ElectronicProduct electronicProduct = new ElectronicProduct(pid, pName, pPrice, pWarranty, pBrand);
		electronicProduct.display();
		sc.close();
		
	}

}
