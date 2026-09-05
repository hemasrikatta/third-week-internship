package com.javagcinfo;

public class Lab4_Student {
		protected void finalize() throws Throwable {
			super.finalize();
			System.out.println("object distored");
		}
		 int student_id = 235;
		 String student_name="hema";
		 void method() {
			 Lab4_Student sn = new Lab4_Student();
			 System.out.println("student_name: "+student_name);
		 }
		public static void main(String[] args) {
			System.out.println("main methos start");
			Lab4_Student s1 = new Lab4_Student();
			Lab4_Student s2 = new Lab4_Student();
			Lab4_Student s3 = new Lab4_Student();
			Lab4_Student s4 = new Lab4_Student();
//			object of the method
			s1=s2;
			System.gc();
		}
	}

