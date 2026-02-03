package com.sunbeam.p2;

import java.util.Scanner;

class Employee {
	int empid;
	String name;
	double salary;

	public void accept(Scanner sc) {
		System.out.print("Enter the empid - ");
		empid = sc.nextInt();
		System.out.print("Enter the name - ");
		name = sc.next();
		System.out.print("Enter the salary - ");
		salary = sc.nextDouble();
	}

	public void display() {
		System.out.println("Empid - " + empid);
		System.out.println("Name - " + name);
		System.out.println("Salary - " + salary);
	}

}

class Manager extends Employee {
	double bonus;

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);

		System.out.print("Enter bonus - ");
		bonus = sc.nextDouble();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Bonus - " + bonus);
	}
}

class Salesman extends Employee {
	int noOfsales;
	double commission;

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter the no of sales - ");
		noOfsales = sc.nextInt();
		System.out.print("Enter the commission per sale - ");
		commission = sc.nextDouble();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("No Of Sales - " + noOfsales);
		System.out.println("Commission - " + commission);
	}
}

public class Program01 {

	public static void performOperation(Employee emp) // upcasting
	{
		Scanner sc = new Scanner(System.in);
		emp.accept(sc);
		emp.display();
	}

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// Employee emp = null;

		// emp = new Employee();
		// process of storing the object of subclass into the super class reference
		// emp = new Manager(); // upcasting
		// emp = new Salesman(); // upcasting

		// emp.accept(sc);
		// emp.display();

		performOperation(new Employee());
		performOperation(new Manager());
		performOperation(new Salesman());
	}

}
