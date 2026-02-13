package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Program01 {
    public static void main(String[] args) {
        // way-1
        Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5, 6);

        List<Integer> l1 = new ArrayList<>();
        Collections.addAll(l1, 1, 2, 3, 4, 5, 6);

        // way-2
        Stream<Integer> s2 = l1.stream();

        //way-3
        Stream<Integer> s3 = Stream.iterate(0, x -> x + 1).limit(6);
    }
}
