package com.java.practice.inheritance;

public class ElectronicProduct extends Product{
	
	private int warrantyPeriod;
	private String brandName;

	public ElectronicProduct(int productId, String productName, double price, int warrantyPeriod, String brandName) {
		super(productId, productName, price);
		this.warrantyPeriod = warrantyPeriod;
		this.brandName = brandName;
	}
	
	
	
	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}



	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	void display() {
		System.out.println("Product Id  :"+getProductId());
		System.out.println("Product Name  :"+getProductName());
		System.out.println("Product Price  :"+getPrice());
		System.out.println("Product Warranty Period  :"+getWarrantyPeriod());
		System.out.println("Product Brand Name  :"+getBrandName());
	}

}
