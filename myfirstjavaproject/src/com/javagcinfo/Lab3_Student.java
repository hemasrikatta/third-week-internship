package com.javagcinfo;

public class Lab3_Student {
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("object distored");
	}
	 int student_id;
	 String student_name;
	public static void main(String[] args) {
		System.out.println("main methos start");
		Lab3_Student s1 = new Lab3_Student();
		Lab3_Student s2 = new Lab3_Student();
		Lab3_Student s3 = new Lab3_Student();
		Lab3_Student s4 = new Lab3_Student();
//		anonymous object
		new Lab3_Student();
		System.gc();
	}
		
	}


