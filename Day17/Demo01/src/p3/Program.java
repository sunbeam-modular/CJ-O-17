package p3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee {
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
        try (FileOutputStream fos = new FileOutputStream("emp2.db")) {
            try (DataOutputStream dos = new DataOutputStream(fos)) {
                for (Employee e : employeeList) {
                    dos.writeInt(e.empid);
                    dos.writeUTF(e.name);
                    dos.writeDouble(e.salary);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void read() {
        List<Employee> employeeList = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream("emp2.db")) {
            try (DataInputStream dis = new DataInputStream(fis)) {
                while (true) {
                    int empid = dis.readInt();
                    String name = dis.readUTF();
                    double salary = dis.readDouble();
                    Employee e = new Employee(empid, name, salary);
                    System.out.println(e);
                    employeeList.add(e);
                }
            }
        } catch (EOFException e) {
            System.out.println("File Reading completed ...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Anil", 10000));
        employeeList.add(new Employee(2, "Mukesh", 20000));
        employeeList.add(new Employee(3, "Ramesh", 30000));
        //write(employeeList);
        read();
    }
}
