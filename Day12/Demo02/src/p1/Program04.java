package p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program04 {
    public static void main(String[] args) {
        Collection<Integer> c1 = new ArrayList<>();
        c1.add(10);
        c1.add(20);
        c1.add(30);
        c1.add(40);
        c1.add(50);

        Iterator<Integer> itr = c1.iterator(); // fail-fast iterators
        while (itr.hasNext()) {
            Integer e = itr.next();
            if (e == 30)
                c1.add(e * 2); // Modify the underlying collection during the iteration
            System.out.println("Element - " + e);
        }
    }
}
