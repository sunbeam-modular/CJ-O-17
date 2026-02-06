package p1;


import java.util.Scanner;

public class Program02 {
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("0.EXIT");
        System.out.println("1.ADD");
        System.out.println("2.SUB");
        System.out.println("3.MUL");
        System.out.println("4.DIV");
        System.out.println("5.SQR");
        System.out.println("6.SQROOT");
        System.out.println("Enter the choice - ");
        int choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        int choice;
        while ((choice = menu()) != 0) {
            switch (choice) {
                case 3:
                    System.out.println("Multiplication Selected");
                    break;
                    
                case 1:
                    System.out.println("Addition Selected");
                    break;
                case 2:
                    System.out.println("Substraction Selected");
                    break;

                case 4:
                    System.out.println("Division Selected");
                    break;
                case 5:
                    System.out.println("Sqaure Selected");
                    break;
                case 6:
                    System.out.println("Square root Selected");
                    break;
            }
        }
    }
}
