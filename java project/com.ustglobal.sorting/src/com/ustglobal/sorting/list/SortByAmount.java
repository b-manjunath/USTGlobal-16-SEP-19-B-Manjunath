package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByAmount implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		
		Long o = o1.amount;
		Long l = o2.amount;
		return o.compareTo(l);
	}

}
