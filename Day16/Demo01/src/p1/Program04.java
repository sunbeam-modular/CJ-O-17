package p1;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Program04 {
    public static void main(String[] args) {
//        String[] arr = {"India is", "my country"};
//        System.out.println("arr - " + Arrays.toString(arr));
//
//        int count = 0;
//        for (String e : arr) {
//            // split
//            String arr1[] = e.split(" ");
//            System.out.println("arr1 - " + Arrays.toString(arr1));
//            count = count + arr1.length;
//        }
//        System.out.println(count);

        Stream<String> s1 = Stream.of("India is", "my country");

        //Stream<String[]> s2 = s1.map(e -> e.split(" "));
        // map returns this
        // Stream<String[]> s3 = Stream.of(new String[]{"India", "is"}, new String[]{"my", "country"});

        // Stream<Stream<String>> s2 = s1.map(e -> Arrays.stream(e.split(" ")));
        // map returns this
        // Stream<Stream<String>> s3 = Stream.of(Stream.of("India", "is"), Stream.of("my", "country"));

        Stream<String> s2 = s1.flatMap(e -> Arrays.stream(e.split(" ")));
        // we want this using flatmap
        // Stream<String> s3 = Stream.of("India", "is", "my", "country");

        long count = s2.count();
        System.out.println("count - " + count);
    }
}
