package com.sunbeaminfo.p1;

import java.util.Scanner;

class Time {
	int hr;
	int min;

	void acceptTime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hrs - ");
		this.hr = sc.nextInt();
		System.out.println("Enter the mins - ");
		min = sc.nextInt();
	}

	void displayTime() {
		System.out.println("Time - " + hr + " : " + this.min);
	}
}

public class Program01 {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time();

		t1.acceptTime(); // acceptTime(&t1)
		t1.displayTime();

		t2.acceptTime();
		t2.displayTime();

		System.out.println(t1);
	}

}
