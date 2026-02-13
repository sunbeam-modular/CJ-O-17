package p1;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Program02 {
    public static void main(String[] args) {
//        Integer[] arr = {1, 2, 3, 4, 5, 6};
//        for (Integer e : arr) {
//            if (e % 2 == 0)  // finding the even numbers
//            {
//                int sqr = e * e; // square of even numbers
//                System.out.println(sqr); // display square of even numbers
//            }
//        }

        Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5, 6);
        // Stream s1 is now processed
        // s1.forEach(e -> System.out.println("Element in s1 - " + e));

        // find the even numbers -> Intermediate Operation
        Stream<Integer> s2 = s1.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer e) {
                System.out.println("Inside the Filter for element - " + e);
                return e % 2 == 0;
            }
        });

        // square the even numbers
        Stream<Integer> s3 = s2.map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer e) {
                System.out.println("Inside Map for element - " + e);
                return e * e;
            }
        });

        // display the square of even numbers
        // Terminal Operation
        s3.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer e) {
                System.out.println("Element in for-each - " + e);
            }
        });
    }
}
