package com.pratice;
import java.util.Scanner;
public class Factors {
	static int factor(int n) {
		if(n==0 | n==1) {
			return 1;
		}
		return factor(n-1)*n;
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter The Number Find The Factors :  ");
		int a = sn.nextInt();
		int sactor = factor(a);
		System.out.println("you enter number factor " +sactor);
	}

}
