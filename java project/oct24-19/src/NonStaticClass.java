
public class NonStaticClass {
	static int a;
	int b;
	{
		a=10;
		b=20;
		System.out.println("non static block 1 executed");
	}
	NonStaticClass()
	{
		System.out.println("constructure method");
	}
	public static void main(String[] args) {
		System.out.println("main started");
		NonStaticClass ns = new NonStaticClass();
		NonStaticClass ns1 = new NonStaticClass();
		System.out.println("====================");
		System.out.println("non static b value: "+ns.b);
		System.out.println("static a value:"+NonStaticClass.a);
		System.out.println("====================");
		System.out.println("main ended");
	}
	{
		System.out.println("non static block 2 executed");
	}
}
