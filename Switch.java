package com.pratice;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int tomato = 33;
		int potato = 50;
		int drumsticks = 20;
		int onion = 55;
		int carrot = 33;
		int beetroot = 60;
		int totalamount = 0;
		String selected_item = "";
		int apple = 70;
		int graps = 30;
		int banana = 40;
		int pineapples = 50;
		int watermelon = 60;
		int kiwi = 40;
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("select catg");
		String catg = sc.nextLine();
		String exitStatus;
		String itemsList = "";
		switch (catg) {
		case "vegtables" -> {
			do {
				System.out.println("enter vegtables items: ");
				String item = sc.nextLine();
				switch (item) {
				case "tomato" -> {
					System.out.println("1 kg tomoto price: " + tomato);
					totalamount += tomato;
					selected_item += "tomato ";

				}
				case "potato" -> {
					System.out.println("1 kg potato price: " + potato);
					selected_item += "potato ";
					totalamount += potato;
				}

				case "drumsticks" -> {
					System.out.println("4 sticks of duramsticks price: " + drumsticks);
					selected_item += "drumsticks ";
					totalamount += drumsticks;
				}
				case "onion" -> {
					System.out.println("1 kg onion price:." + onion);
					selected_item += "onion ";
					totalamount += onion;
				}
				case "carrot" -> {
					System.out.println("1 kg carrot price: " + carrot);
					selected_item += "carrot ";
					totalamount += carrot;
				}

				case "beetroot" -> {
					System.out.println("1 kg beetroot price: " + beetroot);
					selected_item += "beetroot ";
					totalamount += beetroot;
				}

				default -> System.out.println("currently not avaliabe");
				}

				System.out.println("Do you continue to buy more veg items if yes enter y or  else enter n");
				exitStatus = sc.nextLine();
			} while (exitStatus.equals("y"));

		}

		case "fruits" -> {
			do {
				System.out.println("enter fruits items: ");
				String items = sc.nextLine();
				switch (items) {
				case "apple" -> {
					System.out.println("1 kg apple price: " + apple);
					totalamount += tomato;
					selected_item += "tomato ";

				}
				case "graps" -> {
					System.out.println("1 kg graps price: " + graps);
					selected_item += "graps ";
					totalamount += graps;
				}

				case "banana" -> {
					System.out.println("12 pices of banana price: " + banana);
					selected_item += "banana ";
					totalamount += banana;
				}
				case "pineapples" -> {
					System.out.println("1 kg pineapples price :" + pineapples);
					selected_item += "pineapples ";
					totalamount += pineapples;
				}
				case "watermelon" -> {
					System.out.println("1 kg watermelon price: " + watermelon);
					selected_item += "carrot ";
					totalamount += carrot;
				}

				case "kiwi" -> {
					System.out.println(" 2 pices kiwi price: " + kiwi);
					selected_item += "beetroot ";
					totalamount += beetroot;
				}

				default -> System.out.println("currently not avaliabe");
				}

				System.out.println("Do you continue to buy more veg items if yes enter y or  else enter n");
				exitStatus = sc.nextLine();
			} while (exitStatus.equals("y"));
		}
		}

		System.out.println("enter vegtables items: ");
		String items = sc.nextLine();

		System.out.println("you selected items :" + selected_item);

		System.out.println("totalamount: " + totalamount);
	}

}
