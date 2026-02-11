package p1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Program03 {
    public static void main(String[] args) {
//        Deque<Integer> q1 = new LinkedList<>();
        ArrayDeque<Integer> q1 = new ArrayDeque<>();
        // using deque implementation of stack can be acheived
        q1.offerFirst(10);
        q1.offerFirst(20);
        q1.offerFirst(30);

        System.out.println("Element at top - " + q1.peekFirst());
        System.out.println("Popped Element  - " + q1.pollFirst());
        System.out.println("After pop, Element at top - " + q1.peekFirst());
    }
}
