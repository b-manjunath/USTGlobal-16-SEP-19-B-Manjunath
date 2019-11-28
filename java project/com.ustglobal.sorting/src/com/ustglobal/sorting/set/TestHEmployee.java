package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestHEmployee {
	public static void main(String[] args) {

		Comparator<Employee> comp = (e1,e2)->{
			if(e1.id > e2.id) {
				return 1;
			}else if(e1.id < e2.id) {
				return -1;
			}else {
				return 0;
			}
		};

		
		
		TreeSet<Employee> ts = new TreeSet<Employee>(comp);
		Employee e1 = new Employee("nikhil",4,50000);
		Employee e2 = new Employee("akhil",5,30000);
		Employee e3 = new Employee("vimal",2,80000);
		Employee e4 = new Employee("kamal",9,45000);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		System.out.println("======using iterator==========");
		Iterator<Employee> it = ts.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Name is: "+e.name);
			System.out.println("id is: "+e.id);
			System.out.println("Salary is: "+e.salary);

		}

	}
}
