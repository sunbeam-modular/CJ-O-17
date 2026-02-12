package p3;

interface Printable {
    default void display() {
        System.out.println("Printable::display");
    }
}

class Showable {
    public void display() {
        System.out.println("Showable::display");
    }
}

// super class methods gets the highest priority
class Test extends Showable implements Printable {

}

public class Program01 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.display(); // Showable::display
    }
}
