package p2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Outer {
    // members of the outer class
    // fields
    int outer_field1 = 10;
    static int outer_static_field2 = 20;

    // methods
    void m1() {
        System.out.println(outer_field1);
        System.out.println(outer_static_field2);
    }

    static void m2() {
        // System.out.println(outer_field1); // NOT OK
        System.out.println(outer_static_field2);
    }

    // class -> Nested class
    class Inner {
        int inner_field1;
        // static int inner_static_field2; // NOT OK

        void innerM1() {
            System.out.println(outer_field1); //OK
            System.out.println(outer_static_field2);
            System.out.println(inner_field1);
        }

        // static void innerM2() {} // NOT OK
    }

}


public class Program {
    public static void main(String[] args) {
        Outer o1 = new Outer();
//        Outer.Inner i1 = new Outer.Inner(); // Nested class is static
        // Outer.Inner i1 = o1.new Inner(); // Nested class is non static
        Outer.Inner i1 = new Outer().new Inner(); // Nested class is non static
    }
}
