package com.sunbeaminfo.demo02.shapes;

import java.util.Scanner;

public class Rectangle {
	int length;
	int breadth;

	public void calculateArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		length = sc.nextInt();
		System.out.println("Enter the breadth");
		breadth = sc.nextInt();
		double area = length * breadth;
		System.out.println("Area of rectangle - " + area);
	}
}
