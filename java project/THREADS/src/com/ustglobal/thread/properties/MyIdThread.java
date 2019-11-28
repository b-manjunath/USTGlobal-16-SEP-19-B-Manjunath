package com.ustglobal.thread.properties;

public class MyIdThread  extends Thread {
	public static void main(String[] args) {
		
		System.out.println("Main Started");

		System.out.println(Thread.currentThread().getId());

		MyIdThread mi = new MyIdThread();
		System.out.println("My Id Thread : "+mi.getId());

	    System.out.println("Priority : "+Thread.currentThread().getPriority());
	    
	    // Thread.currentThread().setPriority(16);   --------> IllegalArgumentException
	    
		System.out.println("Main Ended");

	}

}
