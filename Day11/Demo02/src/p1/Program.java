package p1;

public class Program {
    // Generic Method
    public static <T> void displayArray(T[] arr) {
        for (T e : arr)
            System.out.println("element - " + e);
    }

    public static void main(String[] args) {
        Integer arr1[] = {10, 20, 30, 40, 50};

        Double arr2[] = {11.22, 22.33, 33.44, 44.55, 55.66};

        String arr3[] = {"Anil", "Mukesh", "Ramesh", "Suresh"};

        displayArray(arr1);
        displayArray(arr2);
        //displayArray(arr3);
        // Program.<String>displayArray(arr2);  // NOT OK
        Program.<String>displayArray(arr3);

    }
}
