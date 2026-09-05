package com.pratice;

public class Cardetails {
	String company;
	String model;
	double price;

	public Cardetails() {
		this("TATA");

	}

	public Cardetails(String company) {
		this("TATA", "Tataaltrows");

	}
	
	

	public Cardetails(String company, String model) {
		this("TATA", "Tataaltrows",2304569.0000);
		
	}

	public Cardetails(String company, String model, double price) {
		
		this.company = company;
		this.model = model;
		this.price = price;
	}

	public static void main(String[] args) {
		Cardetails car = new Cardetails();
		car.display();
	}
	void display() {
		System.out.println(company);
		System.out.println(model);
		System.out.println(price);
		
		
	}
	

}
