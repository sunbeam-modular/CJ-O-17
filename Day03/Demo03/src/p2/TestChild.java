package p2;

import p1.Test;

// inheritance -> subclass
public class TestChild extends Test {

	public void displayTestChild() {
		// System.out.println(num1); // NOT OK
		// System.out.println(num2); // NOT OK
		System.out.println(num3);
		System.out.println(num4);
		// m1();// NOT OK
		// m2();// NOT OK
		m3();
		m4();
	}

}
