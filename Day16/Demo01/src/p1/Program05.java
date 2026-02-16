package p1;

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

public class Program05 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(5, "Mukesh", 20000));
        employeeList.add(new Employee(1, "Ramesh", 50000));
        employeeList.add(new Employee(4, "Anil", 30000));
        employeeList.add(new Employee(2, "Suresh", 10000));
        employeeList.add(new Employee(3, "Ram", 40000));

//        employeeList.stream()
//                .sorted((e1, e2) -> e1.name.compareTo(e2.name))
//                .forEach(System.out::println);

//        employeeList.stream()
//                .sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))
//                .forEach(System.out::println);

        // display employees with salary > 25000
        //employeeList.stream().filter(e -> e.salary > 25000).forEach(System.out::println);

        class EmpDetails {
            String name;
            double DA;
            double salary;
            double total;

            public EmpDetails() {
            }

            public EmpDetails(String name, double DA, double salary) {
                this.name = name;
                this.DA = DA;
                this.salary = salary;
            }

            public EmpDetails(String name, double salary) {
                this.name = name;
                this.DA = salary * 0.5;
                this.salary = salary;
                this.total = this.DA + this.salary;
            }

            @Override
            public String toString() {
                return "EmpDetails{" +
                        "name='" + name + '\'' +
                        ", DA=" + DA +
                        ", salary=" + salary +
                        ", total=" + total +
                        '}';
            }
        }
        // display employees with their DA (DA is 50% of salary)
//        employeeList.stream().map(e -> new EmpDetails(e.name, e.salary * 0.5, e.salary)).forEach(System.out::println);
        employeeList.stream().map(e -> new EmpDetails(e.name, e.salary)).forEach(System.out::println);


        System.out.println("Original List ->");
        employeeList.forEach(System.out::println);
    }
}
