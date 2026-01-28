package com.sunbeam.p1;

public class Program01 {

	public static void mul(int n1, int n2)// no of paramaters - 2
	{
		System.out.println("Multiplication - " + (n1 * n2));
	}

	// method overloading
	public static void mul(int n1, int n2, int n3)// no of paramaters - 3
	{
		System.out.println("Multiplication - " + (n1 * n2 * n3));
	}

	public static void square(int n)// type of parameter - int
	{
		System.out.println("Square - " + (n * n));
	}

	public static void square(double n)// type of parameter - double
	{
		System.out.println("Square - " + (n * n));
	}

	public static void div(int n1, double n2)// order of paramaters - int,double
	{
		System.out.println("Division - " + (n1 / n2));
	}

	public static void div(double n1, int n2)// order of paramaters - double,int
	{
		System.out.println("Division - " + (n1 / n2));
	}

	public static void main(String[] args) {
		mul(10, 2);
		mul(10, 5, 2);
		square(5);
		square(5.5);
		div(10, 2.5);
		div(10.5, 2);

		System.out.println(10);
		System.out.println('A');
		System.out.println("sunbeam");
		System.out.println(11.22);
	}

}
