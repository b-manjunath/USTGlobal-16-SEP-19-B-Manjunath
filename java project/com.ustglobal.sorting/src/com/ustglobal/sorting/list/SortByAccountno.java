package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByAccountno implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		
		Long o = o1.accountno;
		Long l = o2.accountno;
		return o.compareTo(l);

		
	}

}
