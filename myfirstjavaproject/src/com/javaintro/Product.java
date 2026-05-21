package com.javaintro;

public class Product {
	
	String store_name;
	int product_id;
	String product_name;
	int product_price;
	void details() {
		System.out.println("store_name: "+store_name);
		System.out.println("product_id: "+product_id);
		System.out.println("product_name: "+product_name);
		System.out.println("product_price : "+product_price);
	}

	public static void main(String[] args) {
		Product pn = new Product();
		pn.store_name = "D-Mart";
		pn.product_id = 1235;
		pn.product_name = "Dal";
		pn.product_price = 85;
		pn.details();	
	}

}
