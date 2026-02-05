package com.sunbeam.p1;

public class Program02 {

	public static void division(int numerator, int denominator) {
		double result = numerator / denominator;
		System.out.println("Division - " + result);
	}

	public static void main(String[] args) {
		try {
			division(10, 0);
		} catch (ArithmeticException ex) {
			System.out.println("Division with 0 denominator is not possible");
		}
		System.out.println("Program finished successfully");
	}

}
