package p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Program05 {
    public static void main(String[] args) {
        Collection<Integer> c1 = new CopyOnWriteArrayList<>();
        c1.add(10);
        c1.add(20);
        c1.add(30);
        c1.add(40);
        c1.add(50);

        System.out.println("Size of c1 before modification - " + c1.size());


        Iterator<Integer> itr = c1.iterator(); // fail-safe iterators
        while (itr.hasNext()) {
            Integer e = itr.next();
            if (e == 30)
                c1.add(e * 2); // Modify the underlying collection during the iteration
            System.out.println("Element - " + e);
        }

        System.out.println("Size of c1 after modification- " + c1.size());
    }
}
