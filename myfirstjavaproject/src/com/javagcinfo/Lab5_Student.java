package com.javagcinfo;

public class Lab5_Student {
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("object distored");
	}
	Lab5_Student i;
	
	public static void main(String[] args) {
		System.out.println("main methos start");
		Lab5_Student s1 = new Lab5_Student();
		Lab5_Student s2 = new Lab5_Student();
		Lab5_Student s3 = new Lab5_Student();
		s1.i = s3;
		s2.i = s1;
		s3.i = s2;
		s1.i = s2;
		s1=null;
		s2=null;
		s3=null;
		System.gc();
		
	}

}
