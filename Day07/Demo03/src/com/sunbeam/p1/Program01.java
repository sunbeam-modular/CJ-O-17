package com.sunbeam.p1;

class Date {
	int day;
	int month;
	int year;

	public Date() {
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}

}

public class Program01 {

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(1, 1, 2000);
		System.out.println("d1 - " + d1); // It calls the toString() of the object class
		System.out.println("d2 - " + d2); // Fully qualified classname@hashcode
	}

}
