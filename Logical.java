package com.pratice;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		System.out.println("welocome naukari");
		System.out.println("my name is hema sri");
		Scanner sn = new Scanner(System.in);
		System.out.println("What Is Your Name: ");
		String name = sn.nextLine();
		System.out.println("Tell me about yourself.");
		String about = sn.nextLine();
		System.out.println("what is your MCA 1st sem percentage");
		int percentage = sn.nextInt();

		if (percentage > 100 || percentage < 0) {
		   System.out.println("Invalid Percentage");
		   System.out.println("Enter your age:");
			int age = sn.nextInt();
		   if (age >= 18 && age <= 27) {
			    System.out.println("You are eligible for job");
			}
		 else if(percentage >= 90) {
		    System.out.println("A Grade");
		}
		else if (percentage >= 80) {
		    System.out.println("Nice B Grade");
		}
		else if (percentage >= 60) {
		    System.out.println("Super");
		}
			
		else if (age >= 28) {
		    System.out.println("You are not eligible for job");
		    System.out.println("We will get back to you soon");
		}
		else {
		    System.out.println("Bye");
		}
		}
		}
		}