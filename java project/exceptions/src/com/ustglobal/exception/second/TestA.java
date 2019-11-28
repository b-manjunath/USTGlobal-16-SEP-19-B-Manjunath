package com.ustglobal.exception.second;

public class TestA {

	public static void main(String[] args) {
		System.out.println("main strated");
		try {
			Thread.sleep(2000);
			System.out.println("inside try");
		}catch(InterruptedException ie) {
			System.out.println("Exception caught");
			ie.printStackTrace();
		}
		System.out.println("main ended");
	}
}
