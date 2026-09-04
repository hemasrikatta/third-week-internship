package com.pratice;

import java.util.Scanner;

public class BankAccount {

    static String customerName;
    static int accountNumber;
    static double balance = 0;

    // Deposit money
    static void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully!");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw money
    static void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } 
        else {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully!");
        }
    }

    // Display account details
    static void displayAccount() {

        System.out.println("\n==============================");
        System.out.println("       ACCOUNT DETAILS");
        System.out.println("==============================");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : ₹" + balance);
        System.out.println("==============================");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();

        int choice;

        do {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 4:
                    displayAccount();
                    break;

                case 5:
                    System.out.println("Thank you for using our bank!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
