package com.pratice;
import java.util.Scanner;
public class Mathtable {

	public static void main(String[] args) {
			Scanner sn = new Scanner(System.in);
			System.out.println("which table do you want?");
			int n1 = sn.nextInt();
			System.out.println("how many values do you want?");
			int n2 =sn.nextInt();
			for(int i=1; i<=n2; i++) {
				System.out.println(n1+"X"+i+"="+n1*n2);
			}
	}

}
