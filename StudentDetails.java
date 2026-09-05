package com.pratice;

public class StudentDetails {
	int student_id;
	String student_name;

	public StudentDetails() {
		this(101);
	}

	public StudentDetails(int student_id) {
		this(101, "hema");

	}

	public StudentDetails(int student_id, String student_name) {

		this.student_id = student_id;
		this.student_name = student_name;
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		StudentDetails sn= new StudentDetails();
		sn.display();
	}
	void display() {
		System.out.println("student_id: " +this. student_id);
		System.out.println("student_name: " + this.student_name);
	}

}
