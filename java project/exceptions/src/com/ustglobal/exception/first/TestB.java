package com.ustglobal.exception.first;

public class TestB {
	public static void main(String[] args) {
		System.out.println("main method started");
		int a = 10;
		int b = 5;
		try {
			b=10/0;
			System.out.println("Happy Birthday");
			System.out.println("Congratulations");
		}catch(ArithmeticException ae) {
			System.out.println("number is divided by zero");
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println("Main method ended");
	}
}
