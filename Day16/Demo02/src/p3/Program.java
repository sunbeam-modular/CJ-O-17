package p3;

// A class declared inside a method is called as local class
// Local class cannot be declared as static
// Inside local class we cannot declare static fields and static methods
public class Program {
    int outer_field1;
    static int outer_static_field2;

    public void method1() {
        class Inner {
            int inner_field1;
            //static int inner_static_field2; // NOT OK

            void m1() {
                System.out.println(outer_field1);
                System.out.println(outer_static_field2);
                System.out.println(inner_field1);
            }
            //static int m2() {} // NOT OK
        }
        Inner i1 = new Inner();
    }


    public static void method2() {
        class Inner {
            int inner_field1;
            //static int inner_static_field2; // NOT OK

            void m1() {
                // System.out.println(outer_field1); // NOT OK
                System.out.println(outer_static_field2);
                System.out.println(inner_field1);
            }

            //static int m2() {} // NOT OK
        }
        Inner i2 = new Inner();
    }

    public static void main(String[] args) {
        //class EmpSalaryComparator { }

        //class EmpDetails { }

    }
}
