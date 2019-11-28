
public class TestMobile {
	public static void main(String[] args) {
		Android a = new Android();
		a.property();
		a.os();
		System.out.println("====================");
		Sony s = new Sony();
		s.property();
		s.os();
		System.out.println("====================");
		Nokia n = new Nokia();
		n.property();
		n.os();
		System.out.println("====================");
        Mi m = new Mi();
        m.property();
        m.os();
	}
}
