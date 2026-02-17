package p2;

import java.io.*;

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

    public static void write(Employee e) {
        try (FileOutputStream fos = new FileOutputStream("emp1.db")) {
            try (DataOutputStream dos = new DataOutputStream(fos)) {
                dos.writeInt(e.empid);
                dos.writeUTF(e.name);
                dos.writeDouble(e.salary);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void read() {
        try (FileInputStream fis = new FileInputStream("emp1.db")) {
            try (DataInputStream dis = new DataInputStream(fis)) {
                int empid = dis.readInt();
                String name = dis.readUTF();
                double salary = dis.readDouble();
                Employee e = new Employee(empid, name, salary);
                System.out.println(e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //Employee e1 = new Employee(1, "Anil", 10000);
        //write(e1);
        read();
    }
}
