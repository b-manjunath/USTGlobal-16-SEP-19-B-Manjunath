package com.ustglobal.maps;

import java.util.Hashtable;

public class TestG {
public static void main(String[] args) {
	Hashtable<Integer , String> ht = new Hashtable<Integer , String>();
	ht.put(101, "ajay");
	ht.put(201, "manju");
	ht.put(340, "rohit");
	ht.put(104, "kohli");
	ht.put(160, "raina");
	ht.put(250, "raina");
	ht.put(560, "roja");
	ht.put(450, "balayya");
	
	
	//ht.compute(106, null);   -------------->not supported null value(NullPointerException)
    //ht.put(null, "sriram");   -------------> not supported null key(NullPointerException)
	
	System.out.println("Data is : "+ht);
	
}
}
