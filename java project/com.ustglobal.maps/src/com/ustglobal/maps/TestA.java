package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap();
		hm.put("sai nitha sri", 8787878);
		hm.put("mounika", 8865434);
		hm.put("Rachana", 987654);
		hm.put(null,999999);
		//hm.put(null,888888);
		System.out.println("Data" +hm);

		hm.put("Rachana", 987654);
		System.out.println("After add duplicate:"+hm);

		System.out.println("After null "+hm);
		System.out.println("=============================");
		System.out.println("After adding duplicate null values");
		System.out.println(hm);

		System.out.println("==============================");
		Object phoneno = hm .get("shruthi");
		System.out.println("Values "+phoneno);
		System.out.println("========================");

		Object phoneno1 = hm .get("sheela");
		System.out.println("Values "+phoneno1);

		Object value = hm.remove("Rachana");
		System.out.println("Value" +value);
		System.out.println("After remove-------->"+hm);


	}
}
