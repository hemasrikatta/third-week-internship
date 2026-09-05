package com.javaintro;

 class method {
	static method t3 = new method();
	 static void method1() {
		 System.out.println("method1 call");
		 t3.method2();
	 }
	 void method2() {
		 System.out.println("method2 call");
		 t3. method3();
		 }
	 void method3() {
		 System.out.println("method3 call");
	 }
	 static {
		 System.out.println("method start");
		  method1();
	 }
	public static void main(String[] args) {
	
	}

}
