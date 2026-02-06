package p1;

import java.util.Scanner;

enum ECalculator {
    EXIT, ADD, SUB, MUL, DIV, SQR, SQR_ROOT;
}

public class Program03 {
    public static ECalculator menu() {
        Scanner sc = new Scanner(System.in);

        ECalculator[] arr = ECalculator.values(); // array of the enum
        for (ECalculator e : arr)
            System.out.println(e.ordinal() + ". " + e.name());

        System.out.println("Enter the choice - ");
        int choice = sc.nextInt();
        return arr[choice];
    }

    public static void main(String[] args) {
        ECalculator choice;
        while ((choice = menu()) != ECalculator.EXIT) {
            switch (choice) {
                case MUL:
                    System.out.println("Multiplication Selected");
                    break;
                case ADD:
                    System.out.println("Addition Selected");
                    break;
                case SUB:
                    System.out.println("Substraction Selected");
                    break;
                case DIV:
                    System.out.println("Division Selected");
                    break;
                case SQR:
                    System.out.println("Sqaure Selected");
                    break;
                case SQR_ROOT:
                    System.out.println("Square root Selected");
                    break;
            }
        }
    }
}
