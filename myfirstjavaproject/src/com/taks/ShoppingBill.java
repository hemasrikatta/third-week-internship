package com.taks;

import java.util.Scanner;

public class ShoppingBill {

    // Method to calculate discount
    static double calculateDiscount(double total) {

        if (total >= 5000) {
            return total * 0.20;
        } else if (total >= 3000) {
            return total * 0.10;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       SHOPPING BILL SYSTEM");
        System.out.println("================================");

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter number of products: ");
        int numberOfProducts = sc.nextInt();

        double total = 0;

        // Enter product prices
        for (int i = 1; i <= numberOfProducts; i++) {

            System.out.print("Enter price of product " + i + ": ");
            double price = sc.nextDouble();

            total = total + price;
        }

        // Calculate discount
        double discount = calculateDiscount(total);

        // Final amount
        double finalAmount = total - discount;

        System.out.println("\n================================");
        System.out.println("          SHOPPING BILL");
        System.out.println("================================");

        System.out.println("Customer Name : " + customerName);
        System.out.println("Total Amount  : ₹" + total);
        System.out.println("Discount      : ₹" + discount);
        System.out.println("Final Amount  : ₹" + finalAmount);

        if (discount > 0) {
            System.out.println("Congratulations! You received a discount.");
        } else {
            System.out.println("No discount available.");
        }

        System.out.println("================================");

        sc.close();
    }
}
