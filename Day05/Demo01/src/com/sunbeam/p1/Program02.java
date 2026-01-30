package com.sunbeam.p1;

public class Program02 {

	// variable arity/argument method
	public static void add(int... arr) {
		int result = 0;
		for (int e : arr)
			result = result + e;
		System.out.println("Addition - " + result);
	}

	public static void main(String[] args) {
//		int[] arr = new int[] { 10, 20, 30 };
		add(10, 20);
		add(10, 20, 30);
		add(10, 20, 30, 40);

	}

}
