
public class Student {
	String name;
	int age;
	double marks;
	String clgname;
	int idnumber;
	public Student(String sname,int sage,double smarks,String sclgname,int sidnumber) {
		this.name=sname;
		this.age=sage;
		this.marks=smarks;
		this.clgname=sclgname;
		this.idnumber=sidnumber;	
	}
	void printDetails() {
		System.out.println("Student name is: "+name);
		System.out.println("Student age is: "+age);
		System.out.println("Student marks is: "+marks);
		System.out.println("Student clgname is: "+clgname);
		System.out.println("Student idnumber is: "+idnumber);
	}
	public static void main(String[] args) {
		System.out.println("******************************");
		Student s1 = new Student("Manjunath",22,70,"Kuppam Engineering College",512);
		s1.printDetails();
		System.out.println("******************************");
		Student s2 = new Student("Pavan kumar",20,80,"nbk College",122);
		s2.printDetails();
		System.out.println("******************************");
		Student s3 = new Student("Rohit",28,60,"VIT College",435);
		s3.printDetails();
		System.out.println("******************************");
		Student s4 = new Student("Kohli",26,90,"Rajeev gandhi College",234);
		s4.printDetails();
		System.out.println("******************************");
		Student s5 = new Student("yuvraj",25,67,"Annamacharya eng College",879);
		s5.printDetails();
		System.out.println("******************************");
		Student s6 = new Student("Manu",20,50,"loyola College",502);
		s6.printDetails();
		System.out.println("******************************");
		Student s7 = new Student("lohit",22,65,"rajeev gandhi College",222);
		s7.printDetails();
		System.out.println("******************************");
		Student s8 = new Student("Raja",29,56,"velooru engineering College",444);
		s8.printDetails();
		System.out.println("******************************");
		Student s9 = new Student("Kanakala",28,50,"kalasalingam College",274);
		s9.printDetails();
		System.out.println("******************************");
		Student s10 = new Student("NTR",23,63,"dravida eng College",899);
		s10.printDetails();
		System.out.println("******************************");

	}
}
