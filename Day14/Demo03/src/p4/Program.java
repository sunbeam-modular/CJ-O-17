package p4;

// Functional Interfaces
@FunctionalInterface
interface I1 {
    // Single Abstract Method
    void m1(); // SAM
}

//@FunctionalInterface
interface I2 {
    // Multiple Abstract Methods
    // It is not a functional interface
    void m1();

    void m2();
}

@FunctionalInterface
interface I3 {
    void m1(); //SAM

    default void m2() {

    }
}

@FunctionalInterface
interface I4 {
    void m1(); //SAM

    default void m2() {

    }

    static void m3() {

    }
}

public class Program {
}
