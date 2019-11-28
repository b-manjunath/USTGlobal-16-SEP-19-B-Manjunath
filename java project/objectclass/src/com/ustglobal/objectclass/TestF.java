package com.ustglobal.objectclass;

public class TestF {
	public static void main(String[] args)  {
		Cow c1 = new Cow(1,"ganga",10000);
		Cow c2 = new Cow(2,"gowri",20000);
		Cow c3 = new Cow(1,"ganga",10000);
		Cow c4 = c3;
		boolean isEquals = c1.equals(c2);
		System.out.println(c1.equals(c3));
		System.out.println(c3.equals(c4));
		System.out.println(isEquals);
		System.out.println("================Employee class====================");
		Employee e1 = new Employee(101,50000,"manjunath");
		Employee e2 = new Employee(102,65000,"pavan kumar");	
		Employee e3 = new Employee(101,50000,"manjunath");
		Employee e4 = e3;
		boolean isEquals1 = e1.equals(e2);
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e4));
		System.out.println(isEquals1);

}
}
