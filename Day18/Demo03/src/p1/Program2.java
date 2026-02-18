package p1;


class Employee {
    int id;
    String name;
    double salary;

    Employee() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class Program2 {
    public static void main(String[] args) {
        try {
            Class c1 = Class.forName("p1.Employee");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Class c2 = Employee.class;

        Employee e1 = new Employee();
        Class c1 = e1.getClass();
    }
}
