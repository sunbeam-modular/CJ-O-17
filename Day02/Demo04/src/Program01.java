
public class Program01 {

	public static void main(String[] args) {
		int n1 = 10;
		double n2 = n1; // widening
		// the process of storing narrower type of data in to the wider type is called
		// as widening
		// while widening explicit type casting is optional

		double n3 = 11.22;
		int n4 = (int) n3; // Narrowing
		// the process of storing wider type of data into the narrower type is called as
		// narrowing
		// while narrowing explicit type casting is mandatory

		boolean status = true;
		// int n5 = (int) status; // NOT Allowed
		// Conversion from boolean to any other tye in java is not allowed

	}

}
