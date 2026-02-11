package p1;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Program01 {
    public static void main(String[] args) {
//        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(10);
        q1.offer(20);
        q1.add(30);
        q1.offer(40);

        System.out.println("Removed element - " + q1.remove());
        System.out.println("Removed element - " + q1.poll());

        System.out.println("Removed element - " + q1.remove());
        System.out.println("Removed element - " + q1.poll());

        //System.out.println("Removed element - " + q1.remove()); // NoSuchElementException
        System.out.println("Removed element - " + q1.poll()); // null

        //System.out.println("Element at front - " + q1.element()); //NoSuchElementException
        System.out.println("Element at front - " + q1.peek()); // null
    }
}
