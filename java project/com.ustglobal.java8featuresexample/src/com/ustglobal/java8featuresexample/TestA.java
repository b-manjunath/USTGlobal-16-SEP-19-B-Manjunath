package com.ustglobal.java8featuresexample;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {

		Predicate<Employee> p = e-> {
			if(e.salary >=20000) {
				return true;
			}else {
				return false;
			}
		};
		Employee s = new Employee(1,"Manjunath",50000);
		boolean res = p.test(s);
		System.out.println("Result is : "+res);


	}
}
