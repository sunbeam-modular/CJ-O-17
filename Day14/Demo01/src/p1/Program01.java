package p1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program01 {
    public static void main(String[] args) {
//        Set<String> s1 = new HashSet<>();
//        Set<String> s1 = new TreeSet<>();
        Set<String> s1 = new LinkedHashSet<>();
        s1.add("Anil");
        s1.add("Mukesh");
        s1.add("Ramesh");
        s1.add("Suresh");
        s1.add("Anil"); // Duplicate
        s1.add("Mukesh"); // Duplicate
        s1.add(null);
        s1.add(null); // Duplicate

        System.out.println("No of elements in s1 - " + s1.size());

        for (String s : s1)
            System.out.println(s);
    }
}
