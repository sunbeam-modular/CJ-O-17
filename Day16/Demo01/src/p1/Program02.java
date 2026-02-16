package p1;

import java.util.stream.Stream;

public class Program02 {
    public static void main(String[] args) {
//        Integer arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        double res = 0; // identity
//        for(Integer e:arr){
//            res = res + e;
//        }
//        System.out.println("res - "+res);

        Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer result = s1.reduce(0, (res, e) -> res + e);
        System.out.println("Result - " + result);
    }
}
