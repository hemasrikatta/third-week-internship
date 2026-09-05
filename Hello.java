package com.pratice;

import java.util.Scanner;

public class Hello {
	String name;
	String group;
	int rollno;
	float percentage;

	Hello() {
		System.out.println("student details");
	}

	public Hello(String name, String group, int rollno) {
		this.name = name;
		this.group = group;
		this.rollno = rollno;
		System.out.println(name);
		System.out.println(group);
		System.out.println(rollno);

	}

	class Superkey extends Hello {
		String subjectname;
		String grade;

		Superkey() {
			System.out.println("additional student details");
		}

		public Superkey(String subjectname, String grade) {
			this.subjectname = subjectname;
			this.grade = grade;

			System.out.println(subjectname);
			System.out.println(grade);
			System.out.println(super.percentage);
		}

		public static void main(String[] args) {

			Scanner sn = new Scanner(System.in);
			System.out.println("enter student name");
			String name = sn.nextLine();
			System.out.println("enter your group");
			String grade = sn.nextLine();
			System.out.println("enter your rollno");
			int subjectname = sn.nextInt();
			System.out.println("enter student name");
			String grade1 = sn.nextLine();
			System.out.println("enter your percentage");
			float percentage = sn.nextFloat();

		}

	}
}
