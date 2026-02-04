package com.sunbeam.p1;

import java.util.Scanner;

//abstract class Accetable {
//
//	public abstract void accept(Scanner sc);
//
//	public abstract void display(); // fragile base class problem
//
//}

// It provides set of protocols
// Interface are considered as immutable to avoid fragile base class problem
interface Acceptable {
	public abstract void accept(Scanner sc);
}

interface Displayable {
	void display();
}

class Date implements Acceptable, Displayable {
	int day;
	int month;
	int year;

	@Override
	public void accept(Scanner sc) {

	}

	@Override
	public void display() {

	}

}

class Time implements Acceptable {
	int hr;
	int min;

	@Override
	public void accept(Scanner sc) {

	}

}

class Product implements Acceptable, Displayable {
	int pid;
	String name;

	@Override
	public void accept(Scanner sc) {

	}

	@Override
	public void display() {

	}

}

public class Program01 {

	public static void main(String[] args) {
		// Date d1 = new Date();
		// Time t1 = new Time();
		// d1.acceptDate();
		// t1.accept(null);

		Scanner sc = new Scanner(System.in);
		Acceptable a1 = null;
		// a1 = new Date();
		// a1 = new Time();
		a1 = new Product();
		a1.accept(sc);
	}

}
