package p1;

import java.util.function.BinaryOperator;

public class Program01 {
    // sort ->
    // forEach
    public static void doArithmeticOperation(BinaryOperator<Integer> op) {
        Integer n1 = 20;
        Integer n2 = 10;
        System.out.println("Result - " + (op.apply(n1, n2)));
    }

    public static void main(String[] args) {
        // Non Capturing Lambdas
        doArithmeticOperation((x, y) -> x + y);
        doArithmeticOperation((x, y) -> x - y);
        doArithmeticOperation((x, y) -> x * y);
    }
}
