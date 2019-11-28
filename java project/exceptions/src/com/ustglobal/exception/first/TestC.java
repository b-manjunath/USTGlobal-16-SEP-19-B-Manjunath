package com.ustglobal.exception.first;

public class TestC {
	public static void main(String[] args) {
		System.out.println("Main Method Started");

		int[] a = {10,20,30};
		int b = 10;
		System.out.println(b);
		try {
			
			System.out.println(b/0);
			System.out.println(a[4]);
		}catch(ArithmeticException ae) {
			System.out.println("Number Divided By Zero");
		}catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("Array IndexIs Not Present");
		}
		System.out.println("Main Method Ended");

	}
}