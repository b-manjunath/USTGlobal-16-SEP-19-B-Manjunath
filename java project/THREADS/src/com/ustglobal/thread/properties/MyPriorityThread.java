package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread {
	public static void main(String[] args) {

		System.out.println("Main Started");

		int p = Thread.currentThread().getPriority();
		System.out.println("Main Thread Priority : "+p);

		Thread.currentThread().setPriority(7);
		System.out.println("Main Thread Priority : "+Thread.currentThread().getPriority());

		MyPriorityThread t = new MyPriorityThread();
		int q = t.getPriority();
		System.out.println("MyPriorityThread : "+q);

		t.setPriority(6);
		System.out.println("MyPriority Thread Priority : "+t.getPriority());


		System.out.println("Main Ended");
	}

}
