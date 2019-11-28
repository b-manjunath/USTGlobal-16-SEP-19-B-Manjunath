package com.ustglobal.immutable;

public class TestString {
	public static void main(String[] args) {
		
		MyString ms = new MyString(12,"Manju");
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		System.out.println(ms);
		System.out.println("============================");
		ms.changeContent(20, "Pavan");
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		System.out.println(ms);
		System.out.println("====================");
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		System.out.println(ms);
		
		
	}
}
