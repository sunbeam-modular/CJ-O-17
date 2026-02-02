package com.sunbeam.p1;

import java.util.Scanner;

class Date {
	int day;
	int month;
	int year;

	public Date() {
		System.out.println("Date Ctor");
	}

	public void acceptDate() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the day - ");
		day = sc.nextInt();
		System.out.print("Enter the month - ");
		month = sc.nextInt();
		System.out.print("Enter the year - ");
		year = sc.nextInt();
	}

	public void displayDate() {
		System.out.println("Date - " + day + "/" + month + "/" + year);
	}
}

// Employee has-a Date
class Employee {
	int empid;
	String name;
	double salary;
	Date doj = new Date(); // Association - Composition

	public Employee() {
		System.out.println("Employee Ctor");
	}

	public void acceptEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the empid - ");
		empid = sc.nextInt();
		System.out.print("Enter the name - ");
		name = sc.next();
		System.out.print("Enter the salary- ");
		salary = sc.nextDouble();
		System.out.println("Enter the date of joining - ");
		doj.acceptDate();
	}

	public void displayEmployee() {
		System.out.println("Empid - " + empid);
		System.out.println("Name - " + name);
		System.out.println("Salary - " + salary);
		System.out.print("Joining ");
		doj.displayDate();
	}
}

class Customer {
	String name;
	String mobile;
	Date dob; // Association - Aggegration

	public Customer() {
		System.out.println("Customer Ctor");
	}

	public void acceptCustomer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name - ");
		name = sc.next();
		System.out.print("Enter the mobile - ");
		mobile = sc.next();
	}

	// provide the object of the dob externally
	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void displayCustomer() {
		System.out.println("name - " + name);
		System.out.println("mobile - " + mobile);
		if (dob != null)
			dob.displayDate();
	}
}

public class Program01 {

	public static void main(String[] args) {
//		Customer c1 = new Customer();
//		Customer c2 = new Customer();
//
//		c1.acceptCustomer();
//
//		c2.acceptCustomer();
//		Date d1 = new Date();
//		d1.acceptDate();
//		c2.setDob(d1);
//
//		c1.displayCustomer();
//		c2.displayCustomer();

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.acceptEmployee();
		e2.acceptEmployee();

		e1.displayEmployee();
		e2.displayEmployee();

	}

}
