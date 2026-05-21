package com.javaintro;

public class Bank {
	static int serialno = 1235760;
	 {
		 serialno = serialno+1;
		 account_no=serialno;
	 }
	 int account_no;
		 String name;
		 int balance;
		 long phonenumber;
		 void display() {
			 	System.out.println("serial.no: "+serialno);
				System.out.println("account_no: "+account_no);
				System.out.println("name: "+name );
				System.out.println("balance: "+ balance );
				System.out.println("phonenumber: "+ phonenumber );	
		 }

	public static void main(String[] args) {
		Bank cus = new Bank();
		cus.name = "hema";
		cus.balance = 3000;
		cus.phonenumber = 8466973238l;
		cus.display();
		System.out.println("___________________________");
		Bank e = new Bank();
		e.name = "sri";
		e.balance = 2000;
		e.phonenumber = 9676371265l;
		e.display();
		System.out.println("_____________________________");
		Bank m = new Bank();
		m.name = "satya";
		m.balance = 500;
		m.phonenumber = 9652071265l;
		m.display();
		System.out.println("_____________________________");
		Bank a = new Bank();
		a.name = "pooja";
		a.balance = 1000;
		a.phonenumber = 7729941265l;
		a.display();
		System.out.println("____________________________");

 
	}

}
