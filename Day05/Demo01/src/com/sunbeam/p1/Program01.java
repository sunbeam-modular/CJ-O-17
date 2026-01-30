package com.sunbeam.p1;

public class Program01 {

	public static void main(String[] args) {
		int[][] arr = new int[2][];
		System.out.println("Before - ");
		System.out.println(arr[0]);
		System.out.println(arr[1]);

		// Ragged Array
		arr[0] = new int[3];
		arr[1] = new int[2];
		System.out.println("After - ");
		System.out.println(arr[0]);
		System.out.println(arr[1]);

		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;

		arr[1][0] = 40;
		arr[1][1] = 50;

		System.out.println("Using for loop");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Element - " + arr[i][j]);
			}
		}

		System.out.println("Using for each");
		for (int[] ele : arr) {
			for (int e : ele) {
				System.out.println("Element - " + e);
			}
		}
	}

}
