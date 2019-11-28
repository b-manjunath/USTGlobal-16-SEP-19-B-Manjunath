package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(34);
		ts.add(54);
		ts.add(67);
		ts.add(99);
		ts.add(156);
		//ts.add(null);    ------------------>NullPointerException
		//ts.add("Manju"); ------------------>ClassCastException

		System.out.println("******************USING FOR LOOP***************");
		for(Object s : ts) {
			System.out.println(s);
		}

		System.out.println("******************USING ITERATOR*******************");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}


	}
}
