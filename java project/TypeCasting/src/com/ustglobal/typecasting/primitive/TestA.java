package com.ustglobal.typecasting.primitive;
	public class TestA {
		public static void  main(String[] args) {
			byte a = 10;
			int b = a;  // implicit type casting
			System.out.println("b is:"+b);
			System.out.println("===================");
			int c = 20;
			double d = c; // implicit type casting
			System.out.println("d is:"+d);
			System.out.println("===================");
			double e = 50.57;
			byte f = (byte) e;// explicit type casting
			System.out.println("f is :"+f);
			System.out.println("===================");
			long g = 500;
			int h = (int) g;// explicit type casting
			System.out.println("h is :"+h);
			
		}
	}
