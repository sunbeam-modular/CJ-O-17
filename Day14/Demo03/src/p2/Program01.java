package p2;

interface Printable {
    default void display() {
        System.out.println("Printable::display");
    }
}

interface Showable {
    default void display() {
        System.out.println("Showable::display");
    }
}

class Test implements Printable, Showable {
    @Override
    public void display() {
        Printable.super.display();
    }
}

public class Program01 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.display();
    }
}
