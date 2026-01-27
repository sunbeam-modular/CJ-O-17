
public class Program03 {

	public static void main(String[] args) {
		char ch = 'A';
		int n1 = ch; // widening

		int n2 = 65;
		char ch2 = (char) n2; // narrowing

		byte n3 = (byte) ch; // type conversion
		byte n4 = 65;

	}

}
