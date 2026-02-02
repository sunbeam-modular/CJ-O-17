package com.sunbeam.p3;

import java.util.Scanner;

class Employee {
	int empid;
	String name;
	double salary;

	public Employee() {
		System.out.println("Employee Ctor");
	}

	public Employee(int empid, String name, double salary) {
		System.out.println("Employee parameterized Ctor");
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the empid - ");
		empid = sc.nextInt();
		System.out.print("Enter the name - ");
		name = sc.next();
		System.out.print("Enter the salary- ");
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

	public Manager() {
		System.out.println("Manager ctor");
	}

	public Manager(int empid, String name, double salary, double bonus) {
		super(empid, name, salary);
		this.bonus = bonus;
	}

	// Method Overriding
	public void accept() {
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the bonus- ");
		bonus = sc.nextDouble();
	}

	// method override
	public void display() {
		super.display();
		System.out.println("Bonus - " + bonus);
	}
}

class Salesman extends Employee {
	int noOfsales;
	double commission;

	public Salesman() {
	}

	public Salesman(int empid, String name, double salary, int noOfsales, double commission) {
		super(empid, name, salary);
		this.noOfsales = noOfsales;
		this.commission = commission;
	}

	// method overriding
	public void display() {
		super.display();
		System.out.println("noOfsales - " + noOfsales);
		System.out.println("commission - " + commission);
	}
}

public class Program01 {
	public static void main(String[] args) {
//		Manager m1 = new Manager();
//		m1.accept();
//		m1.display();
//
//		Manager m2 = new Manager(2, "Mukesh", 20000, 6000);
//		m2.display();

		Salesman s1 = new Salesman();
		Salesman s2 = new Salesman(2, "Mukesh", 20000, 100, 20);

		s1.display();
		s2.display();
	}

}
