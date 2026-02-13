package p1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program05 {
    public static void displayAllEmployees(List<Employee> employeeList) {
        for (Employee e : employeeList)
            System.out.println(e);
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(5, "Mukesh", 20000));
        employeeList.add(new Employee(1, "Rahul", 40000));
        employeeList.add(new Employee(4, "Anil", 30000));
        employeeList.add(new Employee(2, "Ramesh", 10000));
        employeeList.add(new Employee(3, "Suresh", 50000));

        System.out.println("Original Employee Collection  -> ");
        displayAllEmployees(employeeList);

        System.out.println("Employee Collection sorted on empid -> ");
        // Implementation of Functional Interface
//        employeeList.sort((Employee o1, Employee o2) -> {
//            return o1.empid - o2.empid;
//        });
        
//        employeeList.sort((e1, e2) -> {
//            return e1.empid - e2.empid; // single line of code
//        });

        // shorthand implememntation of functional interface
        // Lambda Expression
        // -> Lambda Operator
        employeeList.sort((e1, e2) -> e1.empid - e2.empid);
        displayAllEmployees(employeeList);
    }
}
