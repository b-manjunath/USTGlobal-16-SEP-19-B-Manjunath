package com.ustglobal.maps;

import java.util.HashMap;

public class testB {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("kuku",998014);
		hm.put("mala",678941);
		hm.put("sheela",789789);

		HashMap hm1 = new HashMap();
		hm1.put("deepu",786567);
		hm1.put("riya",454545);
		hm1.put("kriti",999999);

		boolean hashKey = hm.containsKey("mala");
		System.out.println("Has Key:"+hashKey);
		
		System.out.println("=========================");

		boolean hasValue = hm.containsValue(789789);
		System.out.println("Has value:"+hasValue);
		
		hm.putAll(hm1);
		System.out.println(hm);
		System.out.println("==========================");
		
		System.out.println("After put all "+hm);
		System.out.println("After put all "+hm1);
		
		System.out.println("==================================");
		System.out.println(hm.isEmpty());
		System.out.println(hm1.isEmpty());
		
		System.out.println("==============================");
		System.out.println(hm.size());
		System.out.println(hm1.size());
		System.out.println("===============================");
		
		
		
	}
}
