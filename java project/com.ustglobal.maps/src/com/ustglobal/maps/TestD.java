package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String,Integer>();
		lh.put("Bangaluru",560068);
		lh.put("hariyana",134567);
		lh.put("patna",898900);

		for(Map.Entry<String,Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key : "+key);
			//System.out.println("value : "+value);
		}

	}
}
