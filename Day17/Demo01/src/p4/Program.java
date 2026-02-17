package p4;

import java.io.*;

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

    public static void write(Employee e) {
        try (FileOutputStream fos = new FileOutputStream("emp3.db")) {
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(e);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void read() {
        try (FileInputStream fis = new FileInputStream("emp3.db")) {
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                Employee e = (Employee) ois.readObject();
                System.out.println(e);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //Employee e1 = new Employee(1, "Anil", 10000);
        //write(e1);
        read();
    }
}
