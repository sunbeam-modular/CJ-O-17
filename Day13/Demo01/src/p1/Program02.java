package p1;

import java.util.ArrayList;
import java.util.List;

public class Program02 {
    public static void main(String[] args) {
//        List<String> l1 = new Vector<>();
//        List<String> l1 = new LinkedList<>();
        List<String> l1 = new ArrayList<>();
        l1.add("India"); //0
        l1.add("USA");//1
        l1.add("UK");//2
        l1.add("China");//3
        l1.add("Japan");//4
        l1.add("UK");//5


        System.out.println("Index of UK - " + l1.indexOf("UK"));
        System.out.println("Index of UK - " + l1.lastIndexOf("UK"));
        // index based for-loop
        for (int i = 0; i < l1.size(); i++)
            System.out.println("Country - " + l1.get(i));
    }
}
