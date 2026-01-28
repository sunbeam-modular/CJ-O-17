package com.sunbeaminfo.demo02.shapes;

import java.util.Scanner;

public class Circle {
	int radius;

	public void calculateCircleArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius - ");
		radius = sc.nextInt();
		double area = 3.14 * radius * radius;
		System.out.println("Area of circle - " + area);
	}
}
