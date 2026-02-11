package p1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Program {
    public static void main(String[] args) {
//        List<String> l1 = new Vector<>();
//        List<String> l1 = new LinkedList<>();
        List<String> l1 = new ArrayList<>();
        l1.add("India"); //0
        l1.add("USA");//1
        l1.add("UK");//2

        l1.add(1, "China"); // add the element in between
        l1.set(2, "Japan"); // to replace the element in between

        l1.remove(2);
        l1.remove("China");

        // iterator
        // for-each
        // index based for-loop
        for (int i = 0; i < l1.size(); i++)
            System.out.println("Country - " + l1.get(i));
    }
}
