package p1;

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

    // class -> static Nested class
    static class Inner {
        int inner_field1;
        static int inner_static_field2;

        void innerM1() {
            // System.out.println(outer_field1); //NOT OK
            System.out.println(outer_static_field2);
            System.out.println(inner_field1);
            System.out.println(inner_static_field2);
        }

        static void innerM2() {
            // System.out.println(outer_field1); // NOT OK
            System.out.println(outer_static_field2);
            //System.out.println(inner_field1); // NOT OK
            System.out.println(inner_static_field2);
        }
    }

}


public class Program {
    public static void main(String[] args) {
        // Outer o1 = new Outer();
        Outer.Inner i1 = new Outer.Inner();
        Outer.Inner.innerM2();
    }
}
