package com.subeam.p1;

class Circle {
	int radius;
//	static double PI = 3.14; // field intializer
	static double PI;

	// static initalizer block
	static {
		System.out.println("Static block");
		PI = 3.14;
	}

	{
		System.out.println("Object initializer block");
		radius = 1;
	}

	public Circle(int radius) {
		System.out.println("Inside Ctor");
		this.radius = radius;
	}

	public void calculateArea() {
		System.out.println("Area - " + PI * radius * radius);
	}

	// helper method
	public static void displayAllCircleAreas(Circle arr[]) {
		for (Circle c : arr)
			c.calculateArea();
	}
}

public class Program02 {

	public static void main(String[] args) {

//		Circle c1 = new Circle(5);
//		Circle c2 = new Circle(7);
//		Circle c3 = new Circle(8);
//		Circle c4 = new Circle(11);
//		Circle c5 = new Circle(13);
//
//		c1.calculateArea();
//		c2.calculateArea();
//		c3.calculateArea();
//		c4.calculateArea();
//		c5.calculateArea();

		Circle arr[] = new Circle[5];
		arr[0] = new Circle(5);
		arr[1] = new Circle(7);
		arr[2] = new Circle(9);
		arr[3] = new Circle(11);
		arr[4] = new Circle(13);

		Circle arr2[] = new Circle[3];
		arr2[0] = new Circle(4);
		arr2[1] = new Circle(6);
		arr2[2] = new Circle(8);

//		for (Circle c : arr)
//			c.calculateArea();

//		for (Circle c : arr2)
//			c.calculateArea();

		Circle.displayAllCircleAreas(arr);
		Circle.displayAllCircleAreas(arr2);

	}

}
