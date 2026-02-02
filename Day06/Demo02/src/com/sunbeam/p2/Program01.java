package com.sunbeam.p2;

import java.util.Scanner;

// Parent -> Super class
class Employee {
	int empid;
	String name;
	double salary;

	public Employee() {
		System.out.println("Employee Ctor");
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

// Child class -> Subclass 
class Manager extends Employee {
	double bonus;

	public Manager() {
		System.out.println("Manager ctor");
	}

	// Method Overriding
	public void accept() {
		Scanner sc = new Scanner(System.in);
		super.accept();
		System.out.println("Enter the bonus - ");
		bonus = sc.nextDouble();
	}

	// Method Overriding
	public void display() {
		super.display();
		System.out.println("Bonus - " + bonus);
	}

}

public class Program01 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.accept();
		e1.display();

		Manager m1 = new Manager();
		m1.accept();
		m1.display();
	}

}
