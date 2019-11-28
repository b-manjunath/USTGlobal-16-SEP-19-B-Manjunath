package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
		public static void main(String[] args) {
			TreeSet<Employee> hs = new TreeSet<Employee>();
			Employee e1 = new Employee(12, "Manju", 54000);
			Employee e2 = new Employee(10, "Sainithasri", 43000);
			Employee e3 = new Employee(45, "Pavan", 58000);
			Employee e4 = new Employee(30, "Manoj", 25000);
			Employee e5 = new Employee(30, "Manoj", 25000);
			hs.add(e1);
			hs.add(e2);
			hs.add(e3);
			hs.add(e4);
			hs.add(e5);
			System.out.println("*************using iterator**********");
			Iterator<Employee> it = hs.iterator();
			while(it.hasNext()) {
				Employee e = it.next();
				System.out.println("Id is : "+e.id);
				System.out.println("Name is : "+e.name);
				System.out.println("Salary is : "+e.salary);
				System.out.println("============================");
			}


		}
	}

