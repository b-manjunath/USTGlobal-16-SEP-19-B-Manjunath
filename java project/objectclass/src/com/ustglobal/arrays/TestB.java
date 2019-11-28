package com.ustglobal.arrays;

public class TestB {
	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50};
		//System.out.println(nums[10]);         ArrayIndexOutOfBoundException
		receive(nums);
		int[] values = getArray();
		for(int val : values) {
			System.out.println(val);
		}
	g	
	}
	 
	static void receive(int[] numbers) {
		for(int num : numbers) {
			System.out.println(num);
		}
	}
	static String[] getString() {
		String str[] = {"manjunath","pavan","lakshmi narayana"};
		return str;
	}
}
