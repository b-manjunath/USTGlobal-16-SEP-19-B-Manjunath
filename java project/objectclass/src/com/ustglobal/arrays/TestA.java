package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		nums[4]=50;
		System.out.println("=============INT ARRAY USING FOR LOOP================");
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
		System.out.println("============INT ARRAY USING FOR EACH LOOP==================");
		for(int j:nums)
		{
			System.out.println(j);
		}
		System.out.println("===============CHAR ARRAY USING FOR LOOP===================");
		char[] ch = {'a','b','c','d','e'};
		for(char k=0;k<ch.length;k++)
		{
			System.out.println(ch[k]);
		}
		System.out.println("===============CHAR ARRAY USING FOR EACH LOOP====================");
		for(char k :ch)
		{
			System.out.println(k);
		}
		System.out.println("=============BOOLEAN USING FOR LOOP====================");
		boolean[] boolean = {true,false,true,false,false,true,false};
	    for(boolean m=0;m<boolean.length;m++)
	    {
	    	System.out.println(boolean[m]);
	    }
}}