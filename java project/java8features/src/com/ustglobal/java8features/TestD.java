package com.ustglobal.java8features;

import java.util.function.Consumer;

public class TestD {
	public static void main(String[] args) {
       Consumer<Student> c = s1 ->{
    	   System.out.println("id is : "+s1.id);
    	   System.out.println("name is : "+s1.name);
    	   System.out.println("percentage is : "+s1.percentage);
    	   System.out.println("======================");
       
       };
       Student s = new Student(12,"pavan",89.89);
       c.accept(s);
	}
}
