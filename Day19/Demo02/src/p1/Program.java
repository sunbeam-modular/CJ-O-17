package p1;

@FunctionalInterface // to check if the interface has SAM
interface I1 {
    void m1();
}


public class Program {
    public static void main(String[] args) {

    }

    @Override // to check if the method overriding rules are followed
    public String toString() {
        return super.toString();
    }
}
