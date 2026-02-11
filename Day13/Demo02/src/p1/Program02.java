package p1;

import java.util.ArrayList;
import java.util.Vector;

public class Program02 {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();
        v1.add("India"); // collection
        v1.addElement("USA"); // vector
        v1.addElement("UK");
        v1.addElement("China");

        System.out.println("Element at index 2 - " + v1.get(2)); // list
        System.out.println("Element at index 2 - " + v1.elementAt(2)); // vector
    }
}
