package com.pratice;
import java.util.Scanner;
public class Whileloop {
	
	
	public static void main(String[] args) {
	Scanner sn =new Scanner(System.in);
	System.out.println("enter given number:  ");
	int n = sn.nextInt();
	int rev = 0;
	int rem = 0;
	int temp = n;
//	int count = 0;
		while(n>0) {
//			count = n % 10;
			rem = n%10;
			n = n/10;
			rev = rev *10 + rem;
			
//			count++;
		}
		boolean status =palindrome(n);
		System.out.println("sum of the given number:  "+rev);
		
		
		}
	static boolean palindrome(int n) {
		boolean status = true;
		if(n == 0) {
			status = false;
			System.out.println("not a palidrome");
			return status;
		}
		else {
			System.out.println("is a palidrome");
		}
		return status;
	}

}
