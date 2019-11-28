
public class TestC {
	public static void main(String[] args) {
		Person p=new Person();
		p.name="Manjunath";
		p.age=22;
		Person.color="white";
		System.out.println("person p Name is: "+p.name);
		System.out.println("person p age is: "+p.age);
		System.out.println("person p color is: "+Person.color);
		p.eat();
		p.walk();
		Person.sleep();
		
		
		System.out.println("****************");
		Person p1 = new Person();
		p1.name="pavan kumar";
		p1.age=20;
		Person.color="white";
		System.out.println("person p1 Name is: "+p1.name);
		System.out.println("person p1 age is: "+p1.age);
		System.out.println("person p1 color is: "+Person.color);
		p1.eat();
		p1.walk();
		Person.sleep();
		
		System.out.println("****************");
	}

}
