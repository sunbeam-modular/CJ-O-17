package com.sunbeam.p2;

class Employee {
	int empid;
	String name;
	double salary;
}

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
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	@Override
	public boolean equals(Object obj)// this = d1 , obj = d2 // upcasting -> Object Slicing
	{
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Date) {
			Date d = (Date) obj; // Downcasting
			return this.day == d.day && this.month == d.month && this.year == d.year;
		}
		return false;
	}
}

public class Program01 {

	public static void main(String[] args) {
		// Date d1 = new Date(1, 1, 2000);
		// Date d2 = d1;
		// d2.year = 2002;
		// System.out.println("d1==d2 - " + (d1 == d2)); //true : == operator checks for
		// references

		Date d1 = new Date(1, 1, 2000);
		Date d2 = new Date(1, 1, 2000);
		System.out.println(d1);
		System.out.println(d2);

		System.out.println("d1==d2 - " + (d1 == d2)); // == operator checks for references
		System.out.println("d1.equals(d2) - " + (d1.equals(d2)));
		// equals() is used to check the equality between the 2 objects on their states

	}

}
