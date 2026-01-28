
public class Program02 {

	public static void main(String[] args) {
		Integer i1 = new Integer(20);
		int n1 = i1.intValue(); // unboxing

		int n2 = 100;
		Integer i2 = n2; // Auto-Boxing

		Integer i3 = new Integer(200);
		int n3 = i3; // Auto-unBoxing
	}

}
