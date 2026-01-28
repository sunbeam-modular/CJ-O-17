package com.sunbeam.p1;

class Time {
	int hr;
	int min;

	// constructor
	// It si method used to initialize the state of an object
	Time() {
		System.out.println("Inside ctor");
		hr = 10;
		min = 10;
	}

	void displayTime() {
		System.out.println("Time - " + hr + " : " + min);
	}
}

public class Program01 {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
		t1.displayTime();
		t2.displayTime();
		t3.displayTime();
	}

}
