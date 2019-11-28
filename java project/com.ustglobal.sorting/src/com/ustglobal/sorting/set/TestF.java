package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("nitha sri");
		ts.add("gowthami");
		ts.add("alby baby");
		ts.add("sri latha");
		ts.add("jyothsna");

		System.out.println("******************USING FOR LOOP***************");
		for(String s : ts) {
			System.out.println(s);
		}

		System.out.println("******************USING ITERATOR*******************");
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}

	}
}
