package p1;

public class Program01 {

	public static void main(String[] args) {
		Test t1 = new Test();
		// System.out.println(t1.num1); // NOT OK
		System.out.println(t1.num2);
		System.out.println(t1.num3);
		System.out.println(t1.num4);

		// t1.m1(); // NOT OK
		t1.m2();
		t1.m3();
		t1.m4();
	}

}
