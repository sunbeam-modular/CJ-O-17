package p5;

import java.util.Arrays;

class Test {
    // invokespecial
    Test() {

    }

    // invokestatic
    static void m1() {

    }

    // invokevirtual
    void m2() {

    }
}

public class Program {
    public static void main(String[] args) {
        Test.m1();
        Test t1 = new Test();
        t1.m2();
        Integer[] arr = {9, 4, 7, 2, 3, 1, 8, 5, 6};

        // invokedynamic
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr));
    }
}
