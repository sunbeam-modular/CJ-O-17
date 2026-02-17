package p5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
    int empid;
    String name;
    double salary;

    public Employee() {
    }

    public Employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Program {

    public static void write(List<Employee> employeeList) {
        try (FileOutputStream fos = new FileOutputStream("emp4.db")) {
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(employeeList);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void read() {
        try (FileInputStream fis = new FileInputStream("emp4.db")) {
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                List<Employee> employeeList = (List<Employee>) ois.readObject();
                employeeList.forEach(System.out::println);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            System.out.println("File Reading completed ...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(new Employee(1, "Anil", 10000));
//        employeeList.add(new Employee(2, "Mukesh", 20000));
//        employeeList.add(new Employee(3, "Ramesh", 30000));
//        write(employeeList);
        read();
    }
}
