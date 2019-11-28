package com.ustglobal.streams.list;


import java.util.ArrayList;
import java.util.Comparator;

public class TestD {
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
		
		Comparator<Integer> cmp = (m1,m2)->{
			if(m1>m2) {
				return 1;
			}else if(m1<m2){
				return -1;
			}else {
				return 0;
			}
		};

		long noOfFailedStudents = marks.stream().filter(i -> i <40).count();
		System.out.println(noOfFailedStudents);
		System.out.println("================================");
		
		Integer i = marks.stream().min(cmp).get();
		System.out.println("Max value : "+i);
		
	}
}
