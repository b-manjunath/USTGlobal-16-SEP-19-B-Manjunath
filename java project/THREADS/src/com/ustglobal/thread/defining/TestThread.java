package com.ustglobal.thread.defining;

public class TestThread {
	public static void main(String[] args) {

		System.out.println("mani started");
		MyThread t1 = new MyThread();


		/*
		 * dont call run() method , it behave like normal program
		 * 
		 */

		//t1.run(); 

		t1.start();
		
	    //t1.start();   IllegalThreadStateException
  
		for(int i=0;i<=10;i++) {
			System.out.println("main thread");
		}
		System.out.println("main ended");
	}
}
