
class Time {
	// variables declared inside the class
	// fields
	int hr;
	int min;

	// functions declared inside the class are called as
	// methods
	void displayTime() {
		System.out.println("Time :");
	}

}

public class Program01 {
	public static void main(String[] args) {
		int min; // variable

		// user defined datatype + identifier
		// variable -> References
		Time t1;
		// t1 is storing the address of an object
		t1 = new Time();
		t1.hr = 10;
		t1.displayTime();
		Time t2 = new Time();
	}

}
