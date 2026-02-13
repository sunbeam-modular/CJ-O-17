package p1;

import java.util.function.BinaryOperator;

public class Program02 {
    // sort ->
    // forEach
    public static void doArithmeticOperation(BinaryOperator<Integer> op) {
        Integer n1 = 20;
        Integer n2 = 10;
        System.out.println("Result - " + (op.apply(n1, n2)));
    }

    public static void main(String[] args) {
        // It should be final or effectively final to be used in the lambdas
        int z = 30;
        // z = 40;

        // local class
        class MyBinaryOperator implements BinaryOperator<Integer> {
            @Override
            public Integer apply(Integer x, Integer y) {
                return x + y + z;
            }
        }

        // Capturing Lambdas
        doArithmeticOperation((x, y) -> x + y + z);
        doArithmeticOperation((x, y) -> x - y - z);
        doArithmeticOperation((x, y) -> x * y * z);
    }
}
