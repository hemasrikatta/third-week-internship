package com.pratice;
import java.util.Scanner;

public class FindDivision {
	static void division(int n) {
		for(int i=1; i<=n/4; i++) {
			if(n % i==0) {
				System.out.print(i+"   ");
			}
		}
	}
	
	void main() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter The Number :  ");
		int i1 = sn.nextInt();
		division(i1);
	}

}
