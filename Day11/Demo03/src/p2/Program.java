package p2;


import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int arr1[] = {8, 3, 1, 5, 4, 6, 2, 7};
        System.out.println("Before sorting arr1 - " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("After sorting arr1 - " + Arrays.toString(arr1));

        String arr2[] = {"Suresh", "Anil", "Ramesh", "Mukesh"};
        System.out.println("Before sorting arr2 - " + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("After sorting arr2 - " + Arrays.toString(arr2));

    }
}
