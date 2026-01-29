package com.sunbeam.p1;

public class Program03 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

		for (int[] ele : arr) {
			for (int e : ele)
				System.out.println("Element - " + e);
		}

	}

}
