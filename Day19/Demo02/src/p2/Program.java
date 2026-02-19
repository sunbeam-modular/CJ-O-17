package p2;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface DeveloperInfo {
    String name();

    String company() default "sunbeam";
}


@DeveloperInfo(name = "Rohan")
class Employee {
    int id;
    String name;
    double salary;

    @DeveloperInfo(name = "Nilesh")
    void accept() {
        System.out.println("Employee::accept");
    }

    @DeveloperInfo(name = "Ketan", company = "MKCL")
    void display() {
        System.out.println("Employee::display");
    }

}

class Manager extends Employee {
    @Override
    void accept() {
        super.accept();
    }

    @DeveloperInfo(name = "Rahul", company = "sunbeam karad")
    void calculateTax() {

    }
}

public class Program {
    public static void main(String[] args) {
        // Class c = Employee.class;
        Class c = Manager.class;
        Annotation[] annotations = c.getAnnotations();
        for (Annotation a : annotations) {
            if (a instanceof DeveloperInfo) {
                DeveloperInfo d = (DeveloperInfo) a; // Downcasting
                System.out.println("\nClass level annotation information -> ");
                System.out.println("name - " + d.name());
                System.out.println("company - " + d.company());
                // write the processing logic here
            }
        }

        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods) {
            Annotation[] arr = m.getAnnotations();
            System.out.println("\nMethod level annotation information -> ");
            for (Annotation a : arr) {
                System.out.println("\n " + a);

                if (a instanceof DeveloperInfo) {
                    DeveloperInfo d = (DeveloperInfo) a; // Downcasting
                    System.out.println("name - " + d.name());
                    System.out.println("company - " + d.company());
                    // write the processing logic here
                }
            }
        }
    }
}
