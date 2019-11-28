
public class TestBus {
	public static void main(String[] args) {
		Bus b = new Bus();
		b.getDetails();
		Bus b2 = new Bus(50);
		b2.getDetails();
		Bus b3 = new Bus(60,"red");
		b3.getDetails();
	}
}
