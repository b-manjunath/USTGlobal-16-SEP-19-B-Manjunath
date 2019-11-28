package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(70);
		marks.add(60);
		marks.add(50);
		marks.add(40);
		marks.add(30);
		marks.add(20);
		marks.add(10);
		marks.add(80);
		marks.add(90);
		List<Integer> l = marks.stream().sorted().collect(Collectors.toList());
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println("Sorted--------->");
			System.out.println(i);
		}
	}
}
