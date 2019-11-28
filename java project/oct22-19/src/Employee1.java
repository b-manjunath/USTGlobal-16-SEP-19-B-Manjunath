
public class Employee1 {
	String name;
	int eid;

	public Employee1(String name,int eid) {
		this.name = name;
		this.eid = eid;
	}
	void printDetails() {
		System.out.println("Employee name is: "+name);
		System.out.println("Employee id is: "+eid);
	this.sayHello();
	}
	void sayHello() {
		System.out.println("hello"+name+" welcome to ust global company");
	}
	
	public static void main(String[] args) {
		System.out.println("******************************");
		Employee1 e1 = new Employee1("anupama parameswaran",143);
		e1.printDetails();
		System.out.println("******************************");
		Employee1 e2 = new Employee1("rasmika mandana",123);
		e2.printDetails();
		System.out.println("******************************");
		Employee1 e3 = new Employee1("kareena kapoor",999);
		e3.printDetails();
		System.out.println("******************************");
	}
}
