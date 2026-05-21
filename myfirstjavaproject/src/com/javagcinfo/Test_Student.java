package com.javagcinfo;

class Student {
	String student_name;
	int student_id;
}

public class Test_Student {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
		Student s2 = new Student();
		System.out.println(s2);
		Student s3 = new Student();
		System.out.println(s3);
		
		System.gc();
	}

}
