package p1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program02 {
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

        class EmpIdComparator implements Comparator<Employee> {
            // Single Abstract Method
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.empid - o2.empid;
            }
        }
        // EmpIdComparator empIdComparator = new EmpIdComparator();
        // Comparator comparator = new EmpIdComparator(); // upcasting
        System.out.println("Employee Collection sorted on empid -> ");
        //employeeList.sort(comparator);
        employeeList.sort(new EmpIdComparator()); // Anonymous Object
        displayAllEmployees(employeeList);
    }
}
