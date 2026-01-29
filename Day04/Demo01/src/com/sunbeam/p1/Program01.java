package com.sunbeam.p1;

class Time {
	int hr;
	int min;

	// parameterless ctor
	public Time() {
		System.out.println("Inside parameterless ctor");
		hr = 10;
		min = 10;
	}

	// Parameterized Ctor
	public Time(int hr, int min) {
		System.out.println("Inside parameterized ctor");
		this.hr = hr;
		this.min = min;
	}

	public void displayTime() {
		System.out.println("Time - " + hr + " : " + min);
	}
}

public class Program01 {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time(11, 30); // Dynamic initialization
		t1.displayTime();
		t2.displayTime();
		t3.displayTime();

	}

}
