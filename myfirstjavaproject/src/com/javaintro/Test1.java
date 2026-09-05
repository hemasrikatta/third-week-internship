package com.javaintro;

public class Test1 {
//	static Test1 t3 = new Test1();
	static {
		System.out.println("static method is 1");
//		Test1 t3 = new Test1();
	}
	{
		System.out.println("instance method 2");
	}
	String x;
	public static void main(String[] args) {
		System.out.println("method is start");
		Test1 t3 = new Test1();
//		t3.x = 8;
		System.out.println("instance method x="+t3.x);
	}

}
