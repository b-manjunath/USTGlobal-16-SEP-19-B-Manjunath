package com.ustglobal.streams.list;

import java.util.ArrayList;

public class TestH {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(5,"vikram",56.9));
		al.add(new Student(3,"vijay",58.9));
		al.add(new Student(4,"mahi",34.9));
		al.add(new Student(8,"manju",68.9));
		al.add(new Student(9,"ravi",88.9));
		al.add(new Student(1,"raj",95.9));
		al.add(new Student(2,"ram",48.9));
		
		
		Helper h = new Helper();
		//h.displayAllStudent(al);
	    //h.displayFailedStudent(al);
	    h.displayToperOfClass(al);
	}
}
