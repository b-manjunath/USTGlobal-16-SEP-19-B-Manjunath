package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("manju",350000,12,"UST Global");
		Employee e2 = new Employee("pavan",450000,24,"TCS");
		Employee e3 = new Employee("lohit",32000,27,"wipro");
		Employee e4 = new Employee("ravi",67000,75,"infosis");
		Employee e5 = new Employee("rahul",12000,65,"actenture");
		Employee e6 = new Employee("karthik",67000,99,"test yantra");
		Employee e7 = new Employee("sree",35000,60,"mindtree");
		Employee e8 = new Employee("rahim",26000,22,"cap gemini");
		Employee e9 = new Employee("kalyan",71000,18,"csi");
		Employee e10 = new Employee("kuldeep",96000,07,"mphasis");

		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);

		ArrayList<Employee> al1 = new ArrayList<>();
		al1.add(e5);
		al1.add(e6);
		al1.add(e7);
		al1.add(e8);

		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(e9);
		al2.add(e10);


		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("first" ,al);
		hm.put("second" ,al1);
		hm.put("third" ,al2);

		ArrayList<Employee> first = hm.get("first");

		Iterator<Employee> it = first.iterator();
		while(it.hasNext()){
			Employee s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("Salary is "+s.salary);
			System.out.println("company is "+s.company);
		}


	}
}
