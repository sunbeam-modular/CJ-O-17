package p2;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program01 {
    public static void main(String[] args) {
        // FIFO
        Queue<String> q1 = new PriorityQueue<>(); // Natural Ordering of the elements
        q1.add("S");
        q1.add("U");
        q1.add("N");
        q1.add("B");
        q1.add("E");
        q1.add("A");
        q1.add("M");

        System.out.println("Element removed - " + q1.poll());
        System.out.println("Element removed - " + q1.poll());
        System.out.println("Element removed - " + q1.poll());

    }
}
