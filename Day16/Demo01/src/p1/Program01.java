package p1;

import java.util.stream.Stream;

public class Program01 {
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(8, 3, 7, 1, 4, 2, 5, 6);
        // even numbers(filter) - square(map) - sort(sorted) - display(for-Each)
        //s1.filter(e -> e % 2 == 0).map(e -> e * e).sorted().forEach(System.out::println);

        s1.filter(e -> {
                    // Intermediate Operation
                    // Stateless Operation
                    System.out.println("Inside Filter for element - " + e);
                    return e % 2 == 0;
                }).map(e -> {
                    // Intermediate Operation
                    // Stateless Operation
                    System.out.println("Inside map for element - " + e);
                    return e * e;
                })
                .sorted((i1, i2) -> {
                    // Intermediate Operation
                    System.out.println("Inside sorted for elements, i1 = " + i1 + ", i2 = " + i2);
                    return i1 - i2;
                })
                .forEach(e -> {
                    // Terminal Operation
                    System.out.println("Final Element - " + e);
                });
    }
}
