package p1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Program03 {
    public static void main(String[] args) {
//        Integer[] arr = {1, 2, 3, 4, 5, 6};
//        for (Integer e : arr) {
//            if (e % 2 == 0)  // finding the even numbers
//            {
//                int sqr = e * e; // square of even numbers
//                System.out.println(sqr); // display square of even numbers
//            }
//        }

        System.out.println("Pipeline of operations -> ");
        Stream.of(1, 2, 3, 4, 5, 6)
                .filter(e -> e % 2 == 0)
                .map(e -> e * e)
                .forEach(e -> System.out.println(e));
    }
}
