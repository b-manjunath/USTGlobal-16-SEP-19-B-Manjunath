package com.ustglobal.exception.first;

public class TestE {
	public static void main(String[] args) {
		String s = "hello";
		int[] a = {10,20,30};
		int b = 10;
		System.out.println("Main Method Started");
		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
		}catch(NullPointerException npe) {

			System.out.println("Dont Play With Null");
		}catch(ArrayIndexOutOfBoundsException aie) {

			System.out.println("Index not present");
		}catch (ArithmeticException ae) {
			System.out.println("Divided By Zero");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Method Ended");
	}
}
