package p1;

import java.util.*;

public class Program01 {
    public static void main(String[] args) {
        // It provides the DS for storing the data in a squential order.
        // It provides us index based operations
        List<Integer> l1 = new ArrayList<>();
//        List<Integer> l1 = new Vector<>();
//        List<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);

        // Iterations
        System.out.println("Way-1 using Iterator");
        Iterator<Integer> itr1 = l1.iterator();
        while (itr1.hasNext()) {
            Integer e = itr1.next();
            System.out.println("Element - " + e);
        }

        System.out.println("Way-2 using for-each");
        for (Integer e : l1)
            System.out.println("Element - " + e);

        // Only for List ListInterface and its subtypes
        System.out.println("Way-3 using index based for-loop");
        for (int i = 0; i < l1.size(); i++)
            System.out.println("Element - " + l1.get(i));

        // Only for the Vector
        System.out.println("Way-4 using Enumaration");
    }
}
