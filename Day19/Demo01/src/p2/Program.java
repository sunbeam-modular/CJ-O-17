package p2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Date {
    void accept() {
        System.out.println("Date::accept");
    }

    void display() {
        System.out.println("Date::display");
    }
}

class Employee {
    void accept() {
        System.out.println("Employee::accept");
    }

    void display() {
        System.out.println("Employee::display");
    }
}

class Student {
    void accept() {
        System.out.println("Student::accept");
    }

    void display() {
        System.out.println("Student::display");
    }
}

class Time {
    void accept() {
        System.out.println("Time::accept");
    }

    void display() {
        System.out.println("Time::display");
    }
}

public class Program {
    // 1. It will create a new Object
    // 2. It will call the accept() on the object
    // 3. It will call the display method on the object
    public static void doWork(Class c) {
        try {
            // Object obj = c.newInstance(); // till java 1.8
            Object obj = c.getDeclaredConstructor().newInstance(); // from java 1.9

            Method m1 = c.getDeclaredMethod("accept");
            Method m2 = c.getDeclaredMethod("display");

            m1.invoke(obj);
            m2.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        Date d = new Date();
//        d.accept();
//        d.display();

//        Employee e = new Employee();
//        e.accept();
//        e.display();

//        Student s = new Student();
//        s.accept();
//        s.display();

        doWork(Date.class);
        doWork(Employee.class);
        doWork(Student.class);
        doWork(Time.class);
    }
}
