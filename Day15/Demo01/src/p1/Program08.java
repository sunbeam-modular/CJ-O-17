package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program08 {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(5, "Mukesh", 20000));
        employeeList.add(new Employee(1, "Rahul", 40000));
        employeeList.add(new Employee(4, "Anil", 30000));
        employeeList.add(new Employee(2, "Ramesh", 10000));
        employeeList.add(new Employee(3, "Suresh", 50000));

        System.out.println("Original Employee Collection  -> ");
//        class MyConsumer implements Consumer<Employee> {
//            @Override
//            public void accept(Employee e) {
//                System.out.println(e);
//            }
//        }
        employeeList.forEach((e) -> System.out.println(e));

        System.out.println("Employee Collection sorted on empid -> ");
        employeeList.sort((e1, e2) -> e1.empid - e2.empid);
        employeeList.forEach(e -> System.out.println(e));

        System.out.println("Employee Collection sorted on emp name in asc -> ");
        employeeList.sort((e1, e2) -> e1.name.compareTo(e2.name));
        employeeList.forEach(e -> System.out.println(e));

        System.out.println("Employee Collection sorted on salary in desc -> ");
        employeeList.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));
        employeeList.forEach(e -> System.out.println(e));
    }
}
