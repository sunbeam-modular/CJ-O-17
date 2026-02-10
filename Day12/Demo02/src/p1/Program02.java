package p1;

import java.util.ArrayList;
import java.util.Collection;

public class Program02 {
    public static void main(String[] args) {
        Collection<Integer> c1 = new ArrayList<>();
        c1.add(10);
        c1.add(20);
        c1.add(30);
        c1.add(40);
        c1.add(50);

        c1.remove(40); // It will remove the element from the collection if exists
        c1.remove(70);

        System.out.println("c1 contains 30 ? - " + c1.contains(30)); // true -> AutoBoxing
        System.out.println("c1 contains 80 ? - " + c1.contains(80)); // false

        System.out.println("Total elements in collection - " + c1.size());

        c1.clear();
        System.out.println("Is the collection empty - " + c1.isEmpty());

    }
}
