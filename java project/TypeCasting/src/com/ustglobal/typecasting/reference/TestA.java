package com.ustglobal.typecasting.reference;

public class TestA {
	public static void main(String[] args) {
		Pen p = new Marker();      // upcasting
		System.out.println(p.cost);
		p.write();
		//System.out.println(p.size);       // not possible
		//p.color();                        // not possible
        System.out.println("====================");
		Marker m = (Marker) p;    //down casting
		System.out.println(m.size);
		m.color();
		m.write();
	 
	}
}
