package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String,Integer>();
		lh.put("Bangaluru",560068);
		lh.put("hariyana",134567);
		lh.put("patna",898900);

		System.out.println(lh);
		System.out.println("====================");

		Set<String> s = lh.keySet();
		for(String key : s) {
			System.out.println("Key : "+key);
		}
			System.out.println("==================");
			
			Collection<Integer> c = lh.values();
			for(Integer values : c) {
				System.out.println("Values : "+values);
			}
		}
	}
