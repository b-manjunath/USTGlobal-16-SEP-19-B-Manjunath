package com.ustglobal.exception.first;

public class TestA {
	public static void main(String[] args) {
		System.out.println("Main method started");
		int [] a = {10,20,30};
		System.out.println(a[1]);
		System.out.println(a[0]);
		try {
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Index is not present");
		}
		System.out.println("main method ended");
	}
}
