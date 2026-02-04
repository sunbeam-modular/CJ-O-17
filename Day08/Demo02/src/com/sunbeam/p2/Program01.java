package com.sunbeam.p2;

import java.util.Scanner;

interface Acceptable {
	int num1 = 10; // bydefault the fields declared are static final

	// by default all the declared methods in interface are public abstract
	void accept(Scanner sc);
}

interface Displayable {
	void display();
}

interface Showable {
	void display();
}

class Test implements Acceptable, Displayable, Showable {
	@Override
	public void accept(Scanner sc) {
	}

	@Override
	public void display() {

	}
}

public class Program01 {

	public static void main(String[] args) {
	}

}
