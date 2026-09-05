package com.pratice;

import java.util.Scanner;

public class Rectangular {
	static Scanner sn = new Scanner(System.in);
	 int area1 (int length, int width) {
		
		int area = (length*width) ;
	return area;
	}
	 void hw() {
		 int x= 10;
		 int y = 20;
		 
		 System.out.println(x++ + y++ +y-- +x-- -y++ -x++ +y++);
		 System.out.println();
		 System.out.println(y);
		 
	 }
	 void main() {
		 System.out.println("hello");
		 System.out.println("enter the recangle length");
		int length = sn.nextInt();
		 System.out.println("enter the recangle width");
		int width = sn.nextInt();
		System.out.println("enter the recangle area:"+ area1(length,width));
		hw();
		
	}

}
