
public class Program01 {

	public static void main(String[] args) {
		int n1 = 10; // primitive type(value type)

		Integer i1; // reference
		i1 = new Integer(100);
		Integer i2 = new Integer(200); // non primitive type (Reference type)

		int n2 = 50;
		Integer i3 = new Integer(n2); // Boxing

		System.out.println("n2 - " + n2);
		System.out.println("i3 - " + i3);
	}

}
