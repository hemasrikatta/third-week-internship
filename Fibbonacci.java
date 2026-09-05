package com.pratice;
import java.util.Scanner;
public class Fibbonacci {
	

	public static void main(String[] args) {
		int n1 =0;
		int n2  = 1;
		Scanner sn = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sn.nextInt();
		System.out.print(n1+" "+n2+" ");
		
		for(int i=1;i<=n;i++) {
			int n3 = n1+n2;
			System.out.print(n3+"  ");
			n1 = n2;
			n2 = n3;
			
		}
	}
}
