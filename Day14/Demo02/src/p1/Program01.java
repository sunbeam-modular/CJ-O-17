package p1;

import java.util.*;

public class Program01 {
    public static void main(String[] args) {
        // To store the data in the form of key-value pair use the map
        // Map<Integer, String> m1 = new HashMap<>(); // order of elements is not maintained
        // Map<Integer, String> m1 = new TreeMap<>(); // It stores the elements on the natural ordering of keys
        Map<Integer, String> m1 = new LinkedHashMap<>(); // It maintains the insertion order of the keys

        m1.put(143, "Ramesh");
        m1.put(132, "Mukesh");
        m1.put(154, "Suresh");
        m1.put(121, "Anil");
        m1.put(121, "Anil"); // Duplicate keys are not allowed
        m1.put(122, "Anil"); // Duplicate values are  allowed
        m1.put(121, "Ram"); // Duplicate key but value is different, value will be replaced against the key
        m1.put(null, "Sham"); // we can have null key in the map
        m1.put(null, "Sham"); // multiple null keys are not allowed
        m1.put(133, null);
        m1.put(134, null); // multiple null values are allowed

        System.out.println("No of elements - " + m1.size());

        Set<Integer> keys = m1.keySet();
        for (Integer k : keys)
            System.out.print(k + ", ");

        System.out.println();

        Collection<String> values = m1.values();
        for (String v : values)
            System.out.print(v + ", ");

        System.out.println();
//        Set<String> names;
//        for(String e:names)
        Set<Map.Entry<Integer, String>> entries = m1.entrySet();
        for (Map.Entry<Integer, String> e : entries)
            System.out.println(e.getKey() + " - " + e.getValue());
    }
}
