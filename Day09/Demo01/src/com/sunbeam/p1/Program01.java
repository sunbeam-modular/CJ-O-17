package com.sunbeam.p1;

public class Program01 {

	private static void method1() {
		double arr[] = new double[999999999]; // OutOfMemoryError

	}

	private static void method2() {
		double n1 = 10;
		int n2 = 20;
		long n3 = 30;

		method2();

	}

	public static void main(String[] args) {
		// method1();
		method2();
	}

}
