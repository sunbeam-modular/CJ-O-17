package com.subeam.p1;

class Test {
	static int num1;
	int num2;

	public void display() {
		System.out.println("num1 - " + num1);
		System.out.println("num2 - " + num2);
	}

	public static void testMethod() {
		// As these methods are designed to be called on classname and not on objects
		// this reference is not passed to it.
		// hence we cannot access the non static fields inside this methods
		// System.out.println(num2); // NOT OK
		System.out.println(num1); // OK
	}
}

public class Program01 {

	public static void main(String[] args) {
		System.out.println("Test.num1 - " + Test.num1);
		Test.num1 = 10;

		Test t1 = new Test();
		t1.num2 = 20;
		Test t2 = new Test();
		t2.num2 = 200;
		Test t3 = new Test();
		t3.num2 = 2000;

		t1.num1 = 100;

		System.out.println("t1 - ");
		t1.display();
		System.out.println("t2 - ");
		t2.display();
		System.out.println("t3 - ");
		t3.display();

		Test.testMethod();

	}

}
