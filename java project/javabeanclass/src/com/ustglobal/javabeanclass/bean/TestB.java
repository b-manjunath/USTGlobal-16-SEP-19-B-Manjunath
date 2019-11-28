package com.ustglobal.javabeanclass.bean;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Scanner Class");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Age is:"+age);
		System.out.println("====================");
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Name is:"+name);
		System.out.println("====================");
		System.out.println("Enter name");
		sc.nextLine();
		String name1 = sc.nextLine();
		System.out.println("Name is:"+name1);
		System.out.println("====================");
	}
}
