package com.pratice;

public class Operator_add_sub {
	static int count = 0;
	int x = 0;

	void test() {
		count++;
		x++;

	}

	static Operator_add_sub as = new Operator_add_sub();
	static Operator_add_sub as1 = new Operator_add_sub();

	void operators() {
		byte x = 127;
		short y = 3232;
		byte z = 11;
		System.out.println("subtraction:" + (x - z));
		System.out.println("subtraction:" + (x - y));
		System.out.println("*********************");
		System.out.println("multiplication x,y :" + x * y);
		System.out.println("multiplication x,z :" + x * z);
		System.out.println("*********************");
		System.out.println("division x,y :" + x / y);
		System.out.println("division x,z :" + x / z);
		System.out.println("*********************");
		System.out.println("modulus x,y :" + x % y);
		System.out.println("modulus  x,z :" + x % z);
		System.out.println("*********************");
	}

	void assignment() {
		byte result = 100;
		result += 4.5;
		byte result2 = 100;
		result2 -= 5;
		byte result3 = 100;
		result3 *= 5;
		byte result4 = 100;
		result4 /= 4;
		System.out.println("*********************");
		System.out.println("addition: " + result);
		System.out.println("subtraction: " + result2);
		System.out.println("multipilcation: " + result3);
		System.out.println("division: " + result4);
	}

	void unary() {
		int b = 10;
		int h = 20;
		System.out.println("*********************");
		System.out.println(h++ - b-- + h++ + b++ - h++ + h++);
	}

	void comparision() {
		int l = 20;
		int o = 20;
		System.out.println("*********************");
		System.out.println(l == o);
		int j = 143;
		int a = 122;
		System.out.println(j != a);
		int p = 190;
		int a1 = 120;
		System.out.println(p >= a1);
		float n = 34.5f;
		double lo = 1298.0;
		System.out.println(n <= lo);
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 200;
		int c = 1230;
		as.operators();
		System.out.println("addition: " + (a + b + c));
		System.out.println("addition a,b:" + (a + b));
		System.out.println("addition b,c :" + (b + c));
		as.assignment();
		as.unary();
		as.comparision();
		System.out.println("*********************");
		String s1 = "java";
		String s2 = new String("java").intern();
		System.out.println(s1 == s2);

		Integer d = 128;
		Integer e = 128;
		Integer f = -127;
		Integer g = -127;
		System.out.println("*********************");
		System.out.println(d == e);
		System.out.println(f == g);
		as.test();
		System.out.println(count);
		System.out.println(as.x);
		System.out.println(as1.x);

	}

}
