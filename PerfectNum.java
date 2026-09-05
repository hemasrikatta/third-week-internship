package com.pratice;
import java.util.Scanner;
//input :6-->1 2 3 6 = 12

//output : true|false
public class PerfectNum {
	static boolean perfect(int n) {
		boolean status = false;
		int sum = 0;
		for(int i=1; i<=n/2; i++) {
			
			if(n % i == 0) {
				
			 sum +=i;
			}
		}
			if(sum == n) {
				status = true;
			}	
		
		return status;
	}
	
	public static void main(String[] args) {
		Scanner sn =new Scanner(System.in);
		System.out.println("Enter the number:  ");
		int a = sn.nextInt();
		boolean status = perfect(a);
		if(status) {
			System.out.println("this a perfect number: ");
		}
		else {
			System.out.println("this is not a perfect number");
		}
	}

}
