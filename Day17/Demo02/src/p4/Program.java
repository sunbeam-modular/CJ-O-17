package p4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    int empid;
    String name;
    double salary;
    // transient fields are not seralized
    // any computed fields should not be added in the file
    transient double tax = 0;

    public Employee() {
    }

    public Employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    public void calculateTax() {
        tax = salary * 0.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", tax=" + tax +
                '}';
    }
}

public class Program {

    public static void write(List<Employee> employees) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("emp4.db")) {
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(employees);
            }
        }
    }

    public static void read() throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream("emp4.db")) {
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                List<Employee> employees = (List<Employee>) ois.readObject();
                employees.forEach(e -> {
                    e.calculateTax();
                    System.out.println(e);
                });
            }
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Anil", 10000));
        employees.add(new Employee(2, "Mukesh", 20000));
        employees.add(new Employee(3, "Ramesh", 30000));
        employees.add(new Employee(4, "Suresh", 40000));
        // employees.forEach(e -> e.calculateTax());

        try {
            //write(employees);
            read();
        } catch (Exception e) { // generic catch block
            e.printStackTrace();
        }

    }
}
