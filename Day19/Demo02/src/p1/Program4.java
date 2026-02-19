package p1;

import java.lang.annotation.*;

@Documented
//@Retention(RetentionPolicy.SOURCE)
//@Retention(RetentionPolicy.CLASS)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target({ElementType.TYPE, ElementType.METHOD})
@interface DeveloperInfo {
    String name();

    String company();
}

@DeveloperInfo(name = "rohan", company = "sunbeam")
class Employee {
    int id;
}

class Manager extends Employee {

}

public class Program4 {
    @DeveloperInfo(name = "rohan", company = "sunbeam")
    public static void main(String[] args) {

    }
}
