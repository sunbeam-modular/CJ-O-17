package p2;

import p1.Test;

public class Program02 {

	public static void main(String[] args) {
		Test t1 = new Test();
		// System.out.println(t1.num1);// NOT OK
		// System.out.println(t1.num2);// NOT OK
		// System.out.println(t1.num3);// NOT OK
		System.out.println(t1.num4);

		// t1.m1();// NOT OK
		// t1.m2();// NOT OK
		// t1.m3();// NOT OK
		t1.m4();
	}

}
