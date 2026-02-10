package p1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

public class Program01 {
    public static void main(String[] args) {
        Collection<Integer> c1 = new ArrayList<>();
//        Collection<Integer> c1 = new ArrayDeque<>();
//        Collection<Integer> c1 = new LinkedHashSet<>();
        c1.add(10); // adds the element in the collection
        c1.add(20);
        c1.add(30);
        c1.add(40);
        c1.add(50);
        c1.add(60);

        c1.clear(); // To  remove all the elements from the collection

        System.out.println("Total elements in collection - " + c1.size()); // It will give total count of elements in the collection    }
    }
}
