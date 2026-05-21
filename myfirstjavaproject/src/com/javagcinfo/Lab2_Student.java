package com.javagcinfo;

public class Lab2_Student {
		protected void finalize() throws Throwable {
			super.finalize();
			System.out.println("object distored");
		}
		 int student_id = 765;
		 String student_name = "hema";
		public static void main(String[] args) {
			System.out.println("main methos start");
			Lab2_Student s1 = new Lab2_Student();
			System.out.println("student_id; "+ s1.student_id);
			Lab2_Student s2 = new Lab2_Student();
			System.out.println("student_name; "+ s2.student_name);
			Lab2_Student s3 = new Lab2_Student();
			Lab2_Student s4 = new Lab2_Student();
			s1 = s2;
			System.out.println(s2);
			System.out.println(s1);
			s4 = s2;
			System.gc();
		}
	}


