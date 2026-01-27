import java.util.Scanner;

class Time {
	int hr;
	int min;

	void acceptTime() {
		// to take the input from user.
		// create an object of an Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hrs - ");
		hr = sc.nextInt();
		System.out.println("Enter the mins - ");
		min = sc.nextInt();
	}

	void displayTime() {
		System.out.println("Time = " + hr + " : " + min); // Time = 0 : 0
	}
}

public class Program01 {

	public static void main(String[] args) {
		// Time t1;
		// In java we cannot use the uninitialized variable
		// t1.displayTime();

		Time t1 = new Time();
		t1.acceptTime();
		t1.displayTime(); // OK
	}

}
