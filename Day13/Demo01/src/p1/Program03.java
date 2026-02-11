package p1;

import java.util.*;


public class Program03 {
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

        System.out.println("Forward Traversal - ");
        ListIterator<String> itr1 = l1.listIterator();
        while (itr1.hasNext()) {
            System.out.println("Country - " + itr1.next());
        }

        System.out.println("Reversal Traversal - ");
        ListIterator<String> itr2 = l1.listIterator(l1.size());
        while (itr2.hasPrevious()) {
            System.out.println("Country - " + itr2.previous());
        }
    }
}
