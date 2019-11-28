package com.ustglobal.wrapperclasses;

public class TestA {
	public static void main(String[] args) {
		byte a = 10;
		System.out.println("a is:"+a);
		Byte i = a;  //boxing or auto boxing
		System.out.println("i is:"+i);
		Byte x = 10;
		Byte z = new Byte(10);
		System.out.println("x is"+x);
		byte y = x; // unboxing auto un boxing
		System.out.println("y is "+y);
	}
}
