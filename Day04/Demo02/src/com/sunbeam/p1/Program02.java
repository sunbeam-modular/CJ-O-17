package com.sunbeam.p1;

import java.util.Scanner;

class Student {
	int rollno;
	String name;
	double marks;

	public Student() {
	}

	public Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public void acceptStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rollno - ");
		rollno = sc.nextInt();
		System.out.print("Enter the name - ");
		name = sc.next();
		System.out.print("Enter the marks- ");
		marks = sc.nextDouble();
	}

	public void displayStudent() {
		System.out.println("Student - " + rollno + ", " + name + ", " + marks);
	}

}

public class Program02 {
	public static void main(String[] args) {
//		Student s1 = new Student();
//		Student s2 = new Student(1, "anil", 50);

		// array of students (array of non primitive(reference type))
		Student[] arr = new Student[5];
		arr[0] = new Student(1, "Anil", 50);
		arr[1] = new Student(2, "Mukesh", 60);
		arr[2] = new Student(3, "Ramesh", 70);
		arr[3] = new Student(4, "Suresh", 80);
		arr[4] = new Student();
		arr[4].acceptStudent();

		for (Student e : arr) {
			e.displayStudent();
		}
	}

}
