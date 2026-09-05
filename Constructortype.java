package com.pratice;

//parent class
public class Constructortype {
	String student_name;
	int rollno;
	String course;

	public static void main(String[] args) {
		System.out.println("main method  constructortype");

	}
}

// child class
class Student extends Constructortype {
		double fee = 2345.87;

	public Student() {
		this("satya", 102);
		System.out.println("no args constroctor");

	}

	public Student(String student_name, int rollno) {
		this.student_name = student_name;
		this.rollno = rollno;
		System.out.println("prameterized  constroctor");

	}

	public static void main(String[] args) {
		System.out.println("main method started from constructortype");
//		Hello m = new Hello();
//		m.studentinfo();
//		Hello m1 = new Hello();
//	
//
	}

	void studentinfo() {
		System.out.println("studentname: " + this.student_name);
		System.out.println("student_rollno: " + this.rollno);
		System.out.println("course details: " + this.course);
		System.out.println("fee: " + fee);
		System.out.println("***********************************");
	}

}