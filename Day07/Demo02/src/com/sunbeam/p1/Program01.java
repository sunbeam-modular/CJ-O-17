package com.sunbeam.p1;

// class whose implementation is 100% complete can be declared as final
// we cannot extend the final class
final class Test {
	final int n1 = 10; // field iniializer
	final int n2;
	final int n3;

	// Object Initializer
	{
		n2 = 20;
		// n1 = 100; // NOT OK;
	}

	public Test() {
		n3 = 30;
	}

	public void m1() {
		System.out.println("m1() called");

	}

	// methods that are 100% complete
	public final void m2() {
		System.out.println("m2() called");
	}
}

class TestSub extends Test {
	@Override
	public void m1() {
		super.m1();
	}

	// cannot override the final methods
//	@Override
//	public void m2() {
//		super.m2();
//	}
}

public class Program01 {

	public static void main(String[] args) {
		// final int num1 = 10; /// OK
		final int num1; // OK
		num1 = 10; // OK
		// num1 = 20; // NOT OK;
	}

}
