package com.sunbeam.p2;

class Test {
	int n1 = 1; // field initializer
	int n2;
	int n3;

	// Object/Instance Initializer block
	{
		System.out.println("Inside Object Initializer-2");
		n3 = 30;
	}

	// Object/Instance Initializer block
	{
		System.out.println("Inside Object Initializer-1");
		n2 = 2;
		n3 = 3;
	}

	public Test() {
		System.out.println("Inside Ctor");
		// n3 = 300;
	}

	public Test(int n1, int n2, int n3) {
		System.out.println("Inside Parameterized Ctor");
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}

	public void display() {
		System.out.println("n1 - " + n1);
		System.out.println("n2 - " + n2);
		System.out.println("n3 - " + n3);
	}
}

public class Program01 {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.display();

	}

}
