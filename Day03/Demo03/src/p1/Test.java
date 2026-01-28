package p1;

public class Test {
	// members of the class -> access modifiers
	// private,protected,public,default

	// fields
	private int num1;
	int num2; // package level private
	protected int num3;
	public int num4;

	// methods
	private void m1() {

	}

	void m2() {

	}

	protected void m3() {

	}

	public void m4() {

	}

	public void displayTest() {
		// within the same class all the members are accessiable directly
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		m1();
		m2();
		m3();
		m4();
	}

}
