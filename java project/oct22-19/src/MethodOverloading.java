
public class MethodOverloading {
	public static int add(int a , int b ) {
		System.out.println("add(int a , int b) method");
		return a+b;
	}
	public static long add(int a , float b ) {
		System.out.println("add(int a , float b) method");
		return (long) (a+b);
	}
	public static void add(int a , double b ) {
		System.out.println("add(int a , double b) method");
	}
	public static int multiply(double d , int b) {
		System.out.println("multiply(float a , int b) method");
		return (int) (d+b);
	}
	public static int multiply(int a , int b) {
		System.out.println("multiply(int a , int b) method");
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println("main(String[] args)");
		main(10);
		add(10,20);
		add(10,25.80);
		add(10,20.34);
		multiply(34.05,10);
		multiply(10,20);
	}
	public static void main(int a) {
		System.out.println("main(int a) method");
	}
}
