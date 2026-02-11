package p1;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Program04 {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        Collections.addAll(v1, 10, 20, 30, 40, 50, 60);

        // iterator
        Iterator<Integer> itr = v1.iterator();
        // for-each
        // index based for-loop

        // Enumaration -> only for the vector
        Enumeration<Integer> en = v1.elements();
        while (en.hasMoreElements()) {
            System.out.println("Element - " + en.nextElement());
        }
    }
}
