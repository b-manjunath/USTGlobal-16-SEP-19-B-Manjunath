
public class TestA {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.cost = 100;
		p.color = "orange";
		p.brand  = "cello";
		System.out.println("pen p Cost is: "+p.cost);
		System.out.println("pen p Color is: "+p.color);
		System.out.println("pen p Brand is: "+p.brand);
		p.write();

		System.out.println("**************************");
		Van v=new Van();
		v.brand="bmw";
		v.color="black";
		v.cost=600000;
		System.out.println("van v Cost is: "+v.cost);
		System.out.println("van v Color is: "+v.color);
		System.out.println("van v Brand is: "+v.brand);
		v.ride();

		System.out.println("**************************");
		Van v1=new Van();
		v1.brand="audi";
		v1.color="white";
		v1.cost=550000;
		System.out.println("van v1 Cost is: "+v1.cost);
		System.out.println("van v1 Color is: "+v1.color);
		System.out.println("van v1 Brand is: "+v1.brand);
		v1.ride();
		
		System.out.println("**************************");
		Cow c=new Cow();
		c.name="ganga";
		c.color="white";
		System.out.println(" cow c Name is: "+c.name);
		System.out.println("cow c Color is: "+c.color);
		c.eat();
		c.sleep();
		
		
		System.out.println("**************************");
		Cow c1=new Cow();
		c1.name="gowri";
		c1.color="brown";
		System.out.println("cow c1 Name is: "+c1.name);
		System.out.println("cow c1 Color is: "+c1.color);
		c1.eat();
		c1.sleep();
		
		System.out.println("**************************");
	}
}
