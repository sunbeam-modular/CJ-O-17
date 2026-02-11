package p2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Employee implements Comparable<Employee> {
    int empid;
    String name;
    double salary;

    Employee() {

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

    @Override
    public int compareTo(Employee o) {
        return this.empid - o.empid;
    }
}

public class Program02 {
    public static void main(String[] args) {
        // FIFO
        //Queue<Employee> q1 = new PriorityQueue<>(); // Natural Ordering of the elements
        class EmpSalaryComparator implements Comparator<Employee> {
            @Override
            public int compare(Employee o1, Employee o2) {
                return -Double.compare(o1.salary, o2.salary);
            }
        }
        Queue<Employee> q1 = new PriorityQueue<>(new EmpSalaryComparator()); //  Ordering of the employee on salary
        q1.add(new Employee(3, "Mukesh", 10000));
        q1.add(new Employee(1, "Anil", 30000));
        q1.add(new Employee(4, "Ramesh", 20000));
        q1.add(new Employee(2, "Suresh", 40000));

        System.out.println("Removed Employee - " + q1.poll());
        System.out.println("Removed Employee - " + q1.poll());
        System.out.println("Removed Employee - " + q1.poll());
        System.out.println("Removed Employee - " + q1.poll());
    }
}
