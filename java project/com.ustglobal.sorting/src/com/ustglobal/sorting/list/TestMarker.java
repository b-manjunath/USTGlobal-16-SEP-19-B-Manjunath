package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestMarker {
	public static void main(String[] args) {
		ArrayList<Marker> a1 = new ArrayList<Marker>();
		a1.add(new Marker(50,"blue"));
		a1.add(new Marker(70,"red"));
		a1.add(new Marker(80,"green"));
		a1.add(new Marker(40,"black"));

		System.out.println("Before sorting-------------->");
		display(a1);
		
		SortByPrice sb = new SortByPrice();
		SortByColor sc = new SortByColor();
		//Collections.sort(a1,sb);
		Collections.sort(a1, sc);
		System.out.println("After Sorting------------>");
		display(a1);
	}

	private static void display(ArrayList<Marker> a1) {
		Iterator<Marker> it = a1.iterator();
		while(it.hasNext()) {
			Marker m = it.next();
			System.out.println("Price is : "+m.cost);
			System.out.println("Color is : "+m.color);
			System.out.println("========================");
		}
	}

}
