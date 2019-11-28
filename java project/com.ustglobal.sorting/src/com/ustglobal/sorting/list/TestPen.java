package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestPen {
	public static void main(String[] args) {
		LinkedList<Pen> p = new LinkedList<Pen>();
		Pen p1 = new Pen(20.00,"cello","blue");
		Pen p2 = new Pen(10.00,"brite","red");
		Pen p3 = new Pen(15.00,"doms","blue");
		Pen p4 = new Pen(05.00,"santoor","black"); 
		Pen p5 = new Pen(08.00,"classmate","green");


		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		System.out.println("-----------------Before sorting-----------");
		displayStudentDetails(p);
		Collections.sort(p);
		System.out.println("-------------------After sorting----------");
		displayStudentDetails(p);


	}

	private static void displayStudentDetails(LinkedList<Pen> p) {
		Iterator<Pen> it = p.iterator();
		while(it.hasNext()) {
			Pen s = it.next();
			System.out.println("price is : "+s.price);
			System.out.println("brand is : "+s.brand);
			System.out.println("color is : "+s.color);
			System.out.println("===========================");
		}

	}
}
