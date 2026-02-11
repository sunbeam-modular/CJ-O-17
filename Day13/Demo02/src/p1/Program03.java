package p1;

import java.util.Vector;

public class Program03 {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();

        System.out.println("Initial Vector Size - " + v1.size());
        System.out.println("Initial Vector capacity - " + v1.capacity());

        for (int i = 1; i <= 10; i++)
            v1.add(i);

        System.out.println("Vector Size after adding 10 elements - " + v1.size());
        System.out.println("Vector capacity after adding 10 elements - " + v1.capacity());

        for (int i = 11; i <= 20; i++)
            v1.add(i);
        System.out.println("Vector Size after adding 20 elements - " + v1.size());
        System.out.println("Vector capacity after adding 20 elements - " + v1.capacity());

        v1.add(21);
        System.out.println("Vector Size after adding 21st element - " + v1.size());
        System.out.println("Vector capacity after adding 21st element - " + v1.capacity());

    }
}
