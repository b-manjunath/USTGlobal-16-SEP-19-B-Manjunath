package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
public static void main(String[] args) {
	LinkedHashSet<Double> ls = new LinkedHashSet();
      ls.add(12.3);
      ls.add(52.0);
      ls.add(67.1);
      ls.add(34.5);
      ls.add(87.6);
      ls.add(67.1);
      
      System.out.println("******************USING FOR LOOP***************");
		for(Double s : ls) {
			System.out.println(s);
		}

		System.out.println("******************USING ITERATOR*******************");
		Iterator<Double> it = ls.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}

      
}
}
