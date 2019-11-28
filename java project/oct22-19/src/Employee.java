
public class Employee {
	String name;
	int eid;

	public Employee(String empname,int empid) {
		name = empname;
		eid = empid;
	}
	void printDetails() {
		System.out.println("Employee name is: "+name);
		System.out.println("Employee id is: "+eid);
	}
	public static void main(String[] args) {
		System.out.println("******************************");
		Employee e1 = new Employee("anupama parameswaran",143);
		e1.printDetails();
		System.out.println("******************************");
		Employee e2 = new Employee("rasmika mandana",123);
		e2.printDetails();
		System.out.println("******************************");
		Employee e3 = new Employee("kareena kapoor",999);
		e3.printDetails();
		System.out.println("******************************");
	}
}
