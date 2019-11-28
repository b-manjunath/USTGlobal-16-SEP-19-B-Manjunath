package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(23);
		l.add(54);
		l.add(46);
		l.add(35);

		System.out.println("===============PEEK METHOD====================");

		Integer peekElement = l.peek();
		System.out.println("Peek Element : "+peekElement );
		Integer peekFirstElement = l.peekFirst();
		System.out.println("Peek First Element : "+peekFirstElement );
		Integer PeekLastElement = l.peekLast();
		System.out.println("Peek Last Element : "+PeekLastElement);
		System.out.println("After Peek ---------->" +l);

		System.out.println("================POLL METHOD====================");

		Integer pollElement = l.poll();
		System.out.println("poll Element : "+pollElement );
		Integer pollFirstElement = l.pollFirst();
		System.out.println("Poll First Element : "+pollFirstElement );
		Integer PollLastElement = l.pollLast();
		System.out.println("Poll Last Element : "+PollLastElement);
		System.out.println("After Poll ---------->" +l);
		
		System.out.println("================PUSH  AND POP METHOD=====================");
		
		l.push(50);
		System.out.println("after push-------->" +l);
		Integer o = l.pop();
		System.out.println(o);
		System.out.println("after pop----------->" +l);
	}
}
