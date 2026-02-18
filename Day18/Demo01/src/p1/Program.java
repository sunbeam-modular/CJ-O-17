package p1;

import java.io.FileOutputStream;
import java.io.PrintStream;
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
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Anil", 10000));
        employees.add(new Employee(2, "Mukesh", 20000));
        employees.add(new Employee(3, "Ramesh", 30000));

        try (FileOutputStream fos = new FileOutputStream("emp.txt")) {
            try (PrintStream out = new PrintStream(fos)) {
                for (Employee e : employees)
                    out.println(e.empid + "," + e.name + "," + e.salary);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
