package p1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program02 {
    public static void main(String[] args) {
//        Set<String> s1 = new HashSet<>(); // Order is not maintained
//        Set<String> s1 = new LinkedHashSet<>(); // It maintains the insertion order
        Set<String> s1 = new TreeSet<>(); // Natural ordering of the elements
        s1.add("Mukesh");
        s1.add("Suresh");
        s1.add("Anil");
        s1.add("Ramesh");
        s1.add("Ram");
        s1.add("Sham");
        s1.add("Sham"); // Duplicate


        System.out.println("No of elements in s1 - " + s1.size());

        for (String s : s1)
            System.out.println(s);
    }
}
