
public class Program03 {

	public static void main(String[] args) {
		String s1 = "10"; // Non primitive type
		String s2 = "20";

		int n1 = Integer.parseInt(s1); // primitive type -> unboxing
		int n2 = Integer.parseInt(s2); // unboxing

		System.out.println("Addition(s1+s2) - " + (s1 + s2));
		System.out.println("Addition(n1+n2) - " + (n1 + n2));
	}

}
