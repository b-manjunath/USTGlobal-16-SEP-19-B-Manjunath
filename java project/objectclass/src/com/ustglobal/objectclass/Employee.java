package com.ustglobal.objectclass;

public class Employee {
	int id;
	double salary;
	String name;
	public Employee(int id, double salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		Employee e =(Employee) obj;
		if(this.id == e.id) {
			if(this.salary == e.salary) {
				if(this.name.contentEquals(e.name)) {
					return true;
				}
				else {
					return false;
				}
			}
			else { 
				return false;
			}
		}
		else {
			return false;

		}
	}



}
