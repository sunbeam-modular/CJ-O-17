package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;

public class Program03 {
    public static void doArithmeticOperation(BinaryOperator<Integer> op) {
        Integer n1 = 20;
        Integer n2 = 10;
        System.out.println("Result - " + (op.apply(n1, n2)));
    }

    public static void main(String[] args) {
        // doArithmeticOperation((x, y) -> x + y);

        // Shorthand Implementation of Lambda Expressions
        doArithmeticOperation(Integer::sum); // Method Reference
        // :: -> Method Reference Operator


        List<String> names = new ArrayList<>();
        Collections.addAll(names, "Anil", "Mukesh", "Ramesh", "Suresh", "Ram", "Sham");
        // names.sort((s1, s2) -> s1.compareTo(s2));
        names.sort(String::compareTo); // Method Reference
        
        // names.forEach(s -> System.out.println(s));
        names.forEach(System.out::println); // Method Reference

//        String[] arr = {"Anil", "Mukesh", "Ramesh", "Suresh", "Ram", "Sham"};
//        for (String s : arr)
//            System.out.print(s + ",");
//        System.out.println(Arrays.toString(arr));
    }
}
