package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		Student s1 = new  Student(24,"divya",78.00);
		Student s2 = new  Student(45,"nithasri",76.00);
		Student s3 = new  Student(25,"manju",87.00);
		Student s4 = new  Student(62,"raju",69.00);
		Student s5 = new  Student(19,"murali",99.00);
		Student s6 = new  Student(15,"ramya",79.00); 
		Student s7 = new  Student(14,"sowmya",54.00);
		Student s8 = new  Student(13,"alby",67.00);
		Student s9 = new  Student(11,"bhuvi",67.00);

		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);

		ArrayList<Student> al1 = new ArrayList<>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);

		ArrayList<Student> al2 = new ArrayList<>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);

		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("first" ,al);
		hm.put("second" ,al1);
		hm.put("third" ,al2);

		ArrayList<Student> first = hm.get("first");

		Iterator<Student> it = first.iterator();
		while(it.hasNext()){
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.percentage);
		}

	}

}
