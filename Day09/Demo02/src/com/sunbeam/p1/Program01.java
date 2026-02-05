package com.sunbeam.p1;

import java.util.Scanner;

public class Program01 {
	public static void division(int numerator, int denominator) {
		double result = numerator / denominator;
		System.out.println("Division - " + result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter the numerator - ");
			int numerator = sc.nextInt();
			System.out.print("Enter the denominator - ");
			int denominator = sc.nextInt();
			division(numerator, denominator);
		} finally {
			// close the resources
			System.out.println("Inside Finally Block");
			sc.close();
		}

		System.out.println("Program finished successfully");
	}
}
