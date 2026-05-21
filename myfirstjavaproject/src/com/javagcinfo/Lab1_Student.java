package com.javagcinfo;

public class Lab1_Student {
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("object distored");
	}
	 int student_id = 1233;
	 String student_name = "hema";
	public static void main(String[] args) {
		System.out.println("main methos start");
		Lab1_Student s1 = new Lab1_Student();
		System.out.println("student_id; "+ s1.student_id);
		Lab1_Student s2 = new Lab1_Student();
		Lab1_Student s3 = new Lab1_Student();
		Lab1_Student s4 = new Lab1_Student();
		s1 = null;
		System.gc();
	}
}

