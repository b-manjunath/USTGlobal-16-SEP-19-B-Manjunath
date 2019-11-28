package com.ustglobal.exception.customizeduncheckedexception;

public class TestAge {
	public static void main(String[] args) {
		
		System.out.println("main started");

		Validator v = new Validator();
		try {
			v.verify(15);
		}catch(InvalidAgeException ie) {
			
			System.out.println("Custom exception");
		}
            System.out.println("main ended");
	}
}
