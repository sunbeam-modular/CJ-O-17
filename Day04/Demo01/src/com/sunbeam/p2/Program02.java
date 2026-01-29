package com.sunbeam.p2;

class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
		this(1, 1, 1000); // ctor chaining
		// this statement should be the first statement inside the ctor body
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void displayDate() {
		System.out.println("Date - " + day + "/" + month + "/" + year);
	}
}

public class Program02 {

	public static void main(String[] args) {
		Date d1 = new Date();
		d1.displayDate();
		d1.setYear(2001);
		d1.displayDate();
		Date d2 = new Date(2, 2, 2002);
		d2.displayDate();
	}

}
