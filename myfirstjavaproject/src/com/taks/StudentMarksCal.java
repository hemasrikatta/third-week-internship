package com.taks;

import java.util.Scanner;
import java.util.Random;

public class StudentMarksCal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Student details
        System.out.println("================================");
        System.out.println("   STUDENT INFORMATION SYSTEM");
        System.out.println("================================");

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Java Marks: ");
        double javaMarks = scanner.nextDouble();

        System.out.print("Enter DBMS Marks: ");
        double dbmsMarks = scanner.nextDouble();

        System.out.print("Enter Computer Networks Marks: ");
        double cnMarks = scanner.nextDouble();

        // Calculate total
        double total = javaMarks + dbmsMarks + cnMarks;

        // Calculate average
        double average = total / 3;

        // Pass/Fail
        String result;

        if (average >= 40) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        // Display student result
        System.out.println("\n========== STUDENT RESULT ==========");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Java    : " + javaMarks);
        System.out.println("DBMS    : " + dbmsMarks);
        System.out.println("CN      : " + cnMarks);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Result  : " + result);

        // --------------------------------
        // Hypotenuse Calculator
        // --------------------------------

        System.out.println("\n========== HYPOTENUSE ==========");

        System.out.print("Enter first side: ");
        double sideA = scanner.nextDouble();

        System.out.print("Enter second side: ");
        double sideB = scanner.nextDouble();

        double hypotenuse = Math.sqrt(
                (sideA * sideA) + (sideB * sideB)
        );

        System.out.println("Hypotenuse = " + hypotenuse);

        // --------------------------------
        // Random Number
        // --------------------------------

        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        System.out.println("\nRandom Number: " + randomNumber);

        // --------------------------------
        // Swapping Variables
        // --------------------------------

        System.out.println("\n========== SWAPPING ==========");

        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First  = " + first);
        System.out.println("Second = " + second);

        int temp = first;
        first = second;
        second = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("First  = " + first);
        System.out.println("Second = " + second);

        // --------------------------------
        // GUI
        // --------------------------------

        String message =
                "Student Result\n\n" +
                "Name: " + name +
                "\nAge: " + age +
                "\nTotal: " + total +
                "\nAverage: " + average +
                "\nResult: " + result;
        if (average >= 40) {
            result = "PASS";
            System.out.println("Student Result   :" +result);
        } else {
            result = "FAIL";
            System.out.println("Student Result   :" +result);

        }

        scanner.close();
    }
}
