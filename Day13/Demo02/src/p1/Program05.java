package p1;

import java.util.*;

public class Program05 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);

        System.out.println("Element at the top - " + s1.peek());

        System.out.println("Element Popped - " + s1.pop());
        System.out.println("Element Popped - " + s1.pop());
        System.out.println("After pop, Element at the top - " + s1.peek());
    }
}
