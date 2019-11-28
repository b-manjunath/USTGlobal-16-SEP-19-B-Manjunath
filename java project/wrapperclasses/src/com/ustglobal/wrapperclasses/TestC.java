package com.ustglobal.wrapperclasses;

public class TestC {
	public static void main(String[] args) {
		long a = 107060000000L;
		System.out.println("a is:"+a);
		Long i = a;  //boxing or auto boxing
		System.out.println("i is:"+i);
		Long x = 34553L;
		Long z = new Long(100);
		System.out.println("x is"+x);
		long y = x; // unboxing auto un boxing
		System.out.println("y is "+y);
	}
}
