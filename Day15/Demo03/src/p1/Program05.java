package p1;

import java.util.stream.Stream;

public class Program05 {
    public static void main(String[] args) {
        // Stream.of(8, 3, 4, 7, 9, 5, 8, 2, 4, 6, 5).distinct().forEach(System.out::println);

        long count = Stream.of(8, 3, 4, 7, 9, 5, 8, 2, 4, 6, 5).distinct().count();
        System.out.println("Unique numbers count = " + count);

        //Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).limit(5).forEach(System.out::println);

        // Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).skip(3).limit(5).forEach(System.out::println);

        Stream.of(8, 3, 4, 7, 9, 5, 8, 2, 4, 6, 5).distinct().sorted().forEach(System.out::println);
    }
}
