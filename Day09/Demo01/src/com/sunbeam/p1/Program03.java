package com.sunbeam.p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program03 {

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
		} catch (ArithmeticException ex) {
			System.out.println("Division with 0 denominator is not possible");
		} catch (InputMismatchException ex) {
			System.out.println("Wrong input");
		}
		System.out.println("Program finished successfully");
	}

}
