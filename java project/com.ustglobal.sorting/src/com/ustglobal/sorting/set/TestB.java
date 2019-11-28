package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("vijay");
		hs.add("ajay");
		hs.add("surya");
		hs.add("karthik");
		hs.add("nitha sri");

		System.out.println("******************USING FOR LOOP***************");
		for(String s : hs) {
			System.out.println(s);
		}

		System.out.println("******************USING ITERATOR*******************");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String p = it.next();
			System.out.println(p);
		}



	}
}
