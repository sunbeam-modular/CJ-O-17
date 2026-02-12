package p1;

interface Printable {
    default void display() {
        System.out.println("Printable::display");
    }
}

class Test implements Printable {
    @Override
    public void display() {
        Printable.super.display();
        System.out.println("Test::display");
    }
}

public class Program02 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.display();
    }
}
