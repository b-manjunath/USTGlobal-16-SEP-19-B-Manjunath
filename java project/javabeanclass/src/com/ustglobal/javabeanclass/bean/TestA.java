package com.ustglobal.javabeanclass.bean;

public class TestA {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(512);
		s.setName("manju");
		s.setRollNo(12);
		Database db = new Database();
		db.receive(s);
		
		Employee e = new Employee();
		e.setId(512);
		e.setSalary(45000);
		e.setName("manju");
		e.setDeptno(10);
		e.setDesignation("Developer");
//		Database e = new Database();
		db.save(e);
		}
}
