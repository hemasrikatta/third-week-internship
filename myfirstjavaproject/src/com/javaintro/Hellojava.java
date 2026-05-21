package com.javaintro;

 class Hellojava {
	 int Jno;
	String Name;
	static int CountryId = 1;
	static String CountryName = "india";
	public static void main(String[] args) {
		System.out.println("hello guys");
		System.out.println(CountryId);
		System.out.println(CountryName);
		
	Hellojava msd = new Hellojava();
	System.out.println("object1*******************");
	 msd.Jno = 8;
	 msd.Name = "mahi";
	System.out.println("msd.Jno:" +msd.Jno);
	System.out.println("msd.Named:" +msd.Name);
	 System.out.println("CountryId" +CountryId);
	 System.out.println("CountryName" +CountryName);
	Hellojava hdk = new Hellojava();
	System.out.println("object2*******************");
	 hdk.Jno = 12;
	 hdk.Name = "hardhik";
	System.out.println("hdk Jno:" +hdk.Jno);
	System.out.println("hdkName:" +hdk.Name);
	System.out.println("CountryId:" +CountryId);
	 System.out.println("CountryName:" +CountryName);
	 System.out.println(CountryName);
	
 }
 }
