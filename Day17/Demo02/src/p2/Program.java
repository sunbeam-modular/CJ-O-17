package p2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
    // we will add our own serialversionUID
    private static final long serialVersionUID = 1L;
    int empid;
    String name;
    double salary;
    double bonus;

    public Employee() {
    }

    public Employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    public Employee(int empid, String name, double salary, double bonus) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}

public class Program {

    public static void write(List<Employee> employees) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("emp2.db")) {
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(employees);
            }
        }
    }

    public static void read() throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream("emp2.db")) {
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                List<Employee> employees = (List<Employee>) ois.readObject();
                employees.forEach(System.out::println);
            }
        }
    }

    public static void main(String[] args) {
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee(1, "Anil", 10000));
//        employees.add(new Employee(2, "Mukesh", 20000));
//        employees.add(new Employee(3, "Ramesh", 30000));
//        employees.add(new Employee(4, "Suresh", 40000));

        try {
            //write(employees);
            read();
        } catch (Exception e) { // generic catch block
            e.printStackTrace();
        }

    }
}
