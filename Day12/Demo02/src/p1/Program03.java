package p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program03 {
    public static void main(String[] args) {
        Collection<Integer> c1 = new ArrayList<>();
        c1.add(10);
        c1.add(20);
        c1.add(30);
        c1.add(40);
        c1.add(50);

        System.out.println("Using For-Each");
        // for-each
        for (Integer e : c1)
            System.out.println("Element - " + e);

        System.out.println("Using Iterator");
        Iterator<Integer> itr = c1.iterator();
        while (itr.hasNext()) {
            Integer e = itr.next();
            System.out.println(e);
        }

        System.out.println("Using Iterator and for-loop");
        for (Iterator<Integer> itr1 = c1.iterator(); itr1.hasNext(); ) {
            Integer e = itr1.next();
            System.out.println("Element - " + e);
        }
    }
}
