package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestBank {
	public static void main(String[] args) {
		SortByName sb = new SortByName();
		SortByAmount sa = new SortByAmount();
		SortByAccountno sc = new SortByAccountno();
		//TreeSet<Bank> ts = new TreeSet<Bank>(sb);
		//TreeSet<Bank> ts = new TreeSet<Bank>(sa);
	    TreeSet<Bank> ts = new TreeSet<Bank>(sc);
		
		Bank b1 = new Bank("hdfc",56789,99999999);
		Bank b2 = new Bank("uco",98768765,66666666);
		Bank b3 = new Bank("sbi",234567,33333333);
		Bank b4 = new Bank("axis",98768,11111111);

		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);

		System.out.println("***********USING ITERATOR*********************");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("Name is:"+b.name);
			System.out.println("Amount is:"+b.amount);
			System.out.println("Accountno is:"+b.accountno);
			System.out.println("================================");
		}

	}
}
