package com.ustglobal.accessspecifiers.pkg1;

import com.ustglobal.accessspecifiers.pkg2.Demo;

public class Sample extends Demo{
	public static void main(String[] args) {
		Demo d = new Demo();

		// System.out.println(d.a);  // not posssible
		//d.add();(private)
		//default	
		//System.out.println(d.b);     // not possible
		//d.sub();    //here inheritance not performes so its not possible
		Sample s = new Sample();
		//protected
		System.out.println(s.c);
		s.mul();
		//public
		System.out.println(s.name);
		s.div();
	}
}
