package p1;

import java.util.Optional;
import java.util.stream.Stream;

public class Program03 {
    public static void main(String[] args) {
//        Integer arr[] = {5, 8, 3};
//        Integer max = 0;
//        for (Integer e : arr) {
//            if (e > max)
//                max = e;
//        }
//        System.out.println("max - " + max);


        Stream<Integer> s1 = Stream.of(5, 8, 3);
//        Stream<Integer> s1 = Stream.of();
        Optional<Integer> result = s1.max((i1, i2) -> i1 - i2); // Optional.of(8) OR Optional.empty()
        System.out.println("result - " + result);
        // System.out.println("result - " + result.get()); // get() to be used if we are 100% sure the result is generated
        System.out.println("result - " + result.orElse(0));
        System.out.println("result - " + result.orElseThrow(() -> new RuntimeException()));
        
    }
}
