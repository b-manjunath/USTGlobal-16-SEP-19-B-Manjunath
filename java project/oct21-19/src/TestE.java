
public class TestE {
	public static void main(String[] args) {
		Student.cname="Qspiders";
		Student s=new Student();
		s.name="Manjunath";
		s.usn=512;
		System.out.println("college name is "+Student.cname);
		System.out.println("Name is "+s.name);
		System.out.println("ID is "+s.usn);
	}
}
