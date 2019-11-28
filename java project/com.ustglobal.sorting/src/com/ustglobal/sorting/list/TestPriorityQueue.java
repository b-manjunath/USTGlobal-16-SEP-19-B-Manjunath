package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPriorityQueue {
	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(24);
		pq.add(45);
		pq.add(50);
		pq.add(100);
		pq.offer(30);
		pq.add(12);

		System.out.println("************using iterator*********************");
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(pq.poll());
		}
		System.out.println("After poll:"+pq);
	}
}
