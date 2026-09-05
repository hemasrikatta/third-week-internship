package com.pratice;
import java.util.Scanner;
public class PrimeNum {

	static boolean isprime(int n) {
		boolean status = true;
		if(n==0 ||n==1) {
			return false;
		}
		for(int i=2; i<=n/2;i++) {
			if(n%i ==0) {
			status = false;
			break;
			}
			
		}
		return status;
	}
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("enter number");
		int a = sn.nextInt();
		for(int i=1; i<=a; i++) {
			if(isprime(i)) {
			System.out.print(i+"   ");
		}
		}

	}

}
