package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestB {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(12);
		al.add(45);
		al.add(87);
		al.add(30);
		al.add(57);
		al.add(24);

		List<Integer> l = al.stream().filter(i ->i%2 != 0).collect(Collectors.toList());

		for(Integer i : l) {
			System.out.println(i);
		}

	}
}
