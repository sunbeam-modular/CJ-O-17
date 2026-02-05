package com.sunbeam.p1;

public class Program01 {

	public static void division(int numerator, int denominator) {
		int result = numerator / denominator; // Arithmetic Exception
	}

	public static void method1() {
		try {
			for (int i = 1; i <= 10; i++) {
				Thread.sleep(1000); // InterruptedException - Checked Exception
				System.out.println("count - " + i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void method2() throws InterruptedException {
		for (int i = 11; i <= 20; i++) {
			Thread.sleep(1000); // InterruptedException
			System.out.println("count - " + i);
		}
	}

	public static void main(String[] args) // throws InterruptedException -> Bad Programming Practice
	{
		// division(10, 2); // unchecked Exceptions
		// method1();
		try {
			method2(); // Checked Exception
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Program Finished");
	}
}
