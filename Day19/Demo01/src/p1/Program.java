package p1;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;

class Employee implements Cloneable {
    private int id; // Field f1;
    String name; // Field f2

    Employee() // Constructor c1;
    {
    }

    public Employee(int id) // Constructor c2;
    {
        this.id = id;
    }

    public void accept() // Method m1
    {

    }

    public void display() // Method m2
    {

    }
}

public class Program {
    // Implementation of our own tool like Javap
    public static void showInformationOfClass(Class c) {
        System.out.println("\nInformation about " + c.getSimpleName() + " class");
        System.out.println("class name - " + c.getSimpleName());
        System.out.println("package name - " + c.getPackageName());
        System.out.println("super class - " + c.getSuperclass());

        System.out.println("\nInterfaces ->");
        Class[] interfaces = c.getInterfaces();
        for (Class e : interfaces)
            System.out.println(e);

        System.out.println("\nFields ->");
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields)
            System.out.println(f);

        System.out.println("\nConstructors ->");
        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor ctor : constructors)
            System.out.println(ctor);

        System.out.println("\nMethods ->");
        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods)
            System.out.println(m);

    }

    public static void main(String[] args) {
        //showInformationOfClass(String.class);
        //showInformationOfClass(Object.class);
        //showInformationOfClass(Date.class);
        //showInformationOfClass(ArrayList.class);

        showInformationOfClass(Employee.class);

    }
}
