package com.sunbeam.p1;

public class Program01 {

	public static void main(String[] args) {
		// int arr[]; // reference in java
		// arr = new int[5]; // array object in java

		// int arr[] = new int[5];
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println("using for-loop");
		for (int i = 0; i < arr.length; i++) {
			int e = arr[i];
			System.out.println("Element - " + e);
		}

		System.out.println("using for-each");
		for (int e : arr) {
			System.out.println("Element - " + e);
		}
	}

}
