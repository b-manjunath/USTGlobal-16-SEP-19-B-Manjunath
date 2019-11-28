          

public class StaticClass {
	static int a;
	static int b;
	static
	{
		a=20;
		System.out.println("static block");
	}
	StaticClass()
	{
		System.out.println("constructure executed");
	}
	public static void main(String[] args) {
		StaticClass s = new StaticClass();
		System.out.println("a value :"+a);
		System.out.println("b value :"+b);
	}
	static {
		b=50;
		System.out.println("static block 2");
	}
	static {
		a=100;
		System.out.println("static block 3");
	}
}
