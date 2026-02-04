package com.sunbeam.p1;

import java.util.Scanner;

interface Shape {
	double PI = 3.14;

	void accept(Scanner sc);

	void calculateArea();
}

class Circle implements Shape {
	int radius;

	@Override
	public void accept(Scanner sc) {
		System.out.print("Enter radius - ");
		radius = sc.nextInt();
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of circle - " + (Shape.PI * radius * radius));
	}

}

class Rectangle implements Shape {
	int length;
	int bredth;

	@Override
	public void accept(Scanner sc) {
		System.out.print("Enter length - ");
		length = sc.nextInt();

		System.out.print("Enter breadth - ");
		bredth = sc.nextInt();
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of reactangle - " + (length * bredth));
	}
}

public class Program01 {
	private static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. Area of Circle");
		System.out.println("2. Area of Rectangle");
		System.out.print("Enter your choice - ");
		int choice = sc.nextInt();
		return choice;
	}

	// menu driven code
	public static void main(String[] args) {
		int choice;
		Shape sh = null;
		Scanner sc = new Scanner(System.in);
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				sh = new Circle();
				break;
			case 2:
				sh = new Rectangle();
				break;
			default:
				System.out.println("Wrong choice... :(");
				break;
			}
			if (sh != null) {
				sh.accept(sc);
				sh.calculateArea();
				sh = null;
			}
		}
	}

}
