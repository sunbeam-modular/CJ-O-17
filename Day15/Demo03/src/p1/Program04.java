package p1;

import java.util.stream.Stream;

public class Program04 {
    public static void main(String[] args) {
        System.out.println("Pipeline of operations -> ");
        // display the names ending in a
        Stream.of("Rohan", "Nilesh", "Pradnya", "Amit", "Rachana", "Pooja", "Pratik", "Lalita")
                .filter(s -> s.charAt(s.length() - 1) == 'a')
                .forEach(System.out::println);

    }
}
