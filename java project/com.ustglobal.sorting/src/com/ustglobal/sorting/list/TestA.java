package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(12,"tommy",34.6);
		Student s2 = new Student(16,"baby",45.7);
		Student s3 = new Student(14,"sweety",67.9);
		Student s4 = new Student(19,"jimmy",28.7);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("-----------------Before sorting-----------");
		displayStudentDetails(al);
		Collections.sort(al);
		System.out.println("-------------------After sorting----------");
		displayStudentDetails(al);
		
	}
	static void displayStudentDetails(ArrayList<Student> a1) {
		Iterator<Student> it = a1.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is : "+s.id);
			System.out.println("Name is : "+s.name);
			System.out.println("Percentage is : "+s.percentage);
			System.out.println("===========================");
		}
	}
}
