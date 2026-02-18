package p1;

class Test {
    Test() {
        System.out.println("Test::Ctor");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Test::finalize");
    }
}

class Dummy {
    Dummy() {
        System.out.println("Dummy::Ctor");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Dummy::finalize");
    }
}

public class Program01 {
    public static void m1() {
        Test t1 = new Test(); // GC
        Dummy d1 = new Dummy(); // GC

        t1 = null;
        d1 = new Dummy();
        // System.gc(); // invoking the garbage colletor
        // Runtime.getRuntime().gc(); // invoke the garbage collector
    }

    public static void main(String[] args) {
        m1();
        System.gc();
        System.out.println("Program finished");
    }
}
