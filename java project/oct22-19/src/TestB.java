public class TestB {
	static int a =25;
	int x=10;
	public static void add() {
		// only final access modifier is supported for local modifier
		final int b;

		b = 20;
		System.out.println("a value is : " +a);
		System.out.println("b value is : " +b);
	}
	public static void main(String[] args) {
		add();
		TestB t = new TestB();
		System.out.println("x value is "+t.x);
	}
}
