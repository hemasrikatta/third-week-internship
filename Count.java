package com.pratice;

public class Count {
	static int count = 0;
	int x = 0;

	Count() {
		count++;
		x++;

	}

	void pre() {
		int a = 5;
		int b = 10;
		int c = ++a+b+ +--b +a++ +  ++b- --a;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Count as = new Count();
		Count as1 = new Count();
	as.pre();
		System.out.println(count);
		System.out.println(as.x);
		System.out.println(as1.x);

	}

}
