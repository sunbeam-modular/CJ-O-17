package com.sunbeam.p3;

class Date {
	int day;
	int month;
	int year;

	public Date() {
		this.day = 1;
		this.month = 1;
		this.year = 1900;
	}

	public Date(int year) {
		this();
		this.year = year;
	}

	public void displayDate() {
		System.out.println("Date - " + day + "/" + month + "/" + year);
	}

}

public class Program01 {

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(2000);

		d1.displayDate();
		d2.displayDate();
	}

}
