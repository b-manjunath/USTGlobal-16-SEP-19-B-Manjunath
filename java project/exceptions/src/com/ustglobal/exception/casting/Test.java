package com.ustglobal.exception.casting;

public class Test {
public static void main(String[] args) {
	a aa = new b();
	b bb =(b) aa;
	System.out.println(bb.a);
	bb.m1();
	System.out.println(bb.c);
	bb.m2();
}
}
