package com.sunbeam.p1;

import java.util.Scanner;

// a class which consists of abstract methods are called as abstract class
abstract class Employee {
	int empid;
	String name;
	double salary;

	public Employee() {
	}

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

	// 100% incomplete method is called as abstract method
	// we need to declare such methods as abstract in java
	public abstract void calculateTotalSalary();

}

// concreate
class Manager extends Employee {
	double bonus;

	public Manager() {
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter the bonus - ");
		bonus = sc.nextDouble();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Bonus - " + bonus);
	}

	@Override
	public void calculateTotalSalary() {
		double totalSalary = salary + bonus;
		System.out.println("Total Salary - " + totalSalary);
	}

}

// concreate
class Salesman extends Employee {
	int noOfSales;
	double commission;

	public Salesman() {
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter the no of products sold - ");
		noOfSales = sc.nextInt();
		System.out.print("Enter the commission per product - ");
		commission = sc.nextDouble();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("No of products sold - " + noOfSales);
		System.out.println("Commission per product - " + commission);
	}

	public void calculateTotalCommission() {
		double totalcommission = noOfSales * commission;
		System.out.println("Total commission - " + totalcommission);
	}

	@Override
	public void calculateTotalSalary() {
		double totalSalary = salary + (commission * noOfSales);
		System.out.println("Total Salary - " + totalSalary);

	}

}

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = null; // We can create only references of abstract class
		// emp = new Employee(); // NOT OK -> We cannot create object of abstract class
		emp = new Manager(); // upcasting
		// emp = new Salesman(); // upcasting

		emp.accept(sc); // DMD - Dynamic Method Dispatch (cpp-Late Binding)
		emp.display();
		emp.calculateTotalSalary();

		// emp.calculateTotalCommission(); // Object Slicing
		if (emp instanceof Salesman) {
			Salesman sm = (Salesman) emp;
			sm.calculateTotalCommission();
		}
	}

}
