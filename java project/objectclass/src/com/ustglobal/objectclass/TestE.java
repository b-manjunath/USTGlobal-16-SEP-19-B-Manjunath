package com.ustglobal.objectclass;

public class TestE {
	public static void main(String[] args) {
		Car c = new Car(2000000,"BMW","black");
		int a = c.hashCode();
		System.out.println(a);
		String b = c.toString();
		System.out.println(b);
	}
}
