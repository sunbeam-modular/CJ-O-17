package p4;

import java.util.Arrays;
import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        Integer[] arr = {9, 4, 7, 2, 3, 1, 8, 5, 6};
        // Program$1IntegerComparator.class
//        class IntergerComparator implements Comparator<Integer> {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        }
//        Arrays.sort(arr, new IntergerComparator());

        // Program$1.class
//        Comparator<Integer> integerComparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        };
//        Arrays.sort(arr, integerComparator);

// Program$1.class
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });

        // For Lambda express no any .class file is created
        // Lambda expressions are executed with a very specail instruction called as
        // invokedynamic
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr));
    }
}
