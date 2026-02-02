package com.sunbeam.p1;

import java.util.Scanner;

// Parent -> Super class
class Employee {
	int empid;
	String name;
	double salary;

	public Employee() {
		System.out.println("Employee Ctor");
	}

	public Employee(int empid, String name, double salary) {
		System.out.println("Employee Parameterized Ctor");
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public void acceptEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the empid - ");
		empid = sc.nextInt();
		System.out.print("Enter the name - ");
		name = sc.next();
		System.out.print("Enter the salary- ");
		salary = sc.nextDouble();
	}

	public void displayEmployee() {
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

	public Manager(int empid, String name, double salary, double bonus) {
		super(empid, name, salary);
		this.bonus = bonus;
	}

	public void acceptManager() {
		Scanner sc = new Scanner(System.in);
		this.acceptEmployee();
		System.out.println("Enter the bonus - ");
		bonus = sc.nextDouble();
	}

	public void displayManger() {
		displayEmployee();
		System.out.println("Bonus - " + bonus);
	}

}

public class Program01 {
	public static void main(String[] args) {
		// Employee e = new Employee();
		// Manager m = new Manager();
		// m.acceptManager();
		// m.displayManger();

		// Employee e1 = new Employee();
		// e1.displayEmployee();

		// Employee e2 = new Employee(1, "Anil", 10000);
		// e2.displayEmployee();

		// Manager m1 = new Manager();
		// m1.displayManger();

		Manager m2 = new Manager(1, "Anil", 10000, 5000);
		m2.displayManger();
	}

}
