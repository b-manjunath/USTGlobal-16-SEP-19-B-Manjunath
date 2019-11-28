package com.ustglobal.stringclass;

public class TestA {
	public static void main(String[] args) {
		String s1 = "Anupama";
		String s2 = "kareena";
		String s3 = new String("Anupama");
		String s4 = new String("Anupama");
		String s5 = "Anupama";
		// here we never compare to equals operator always use equals method
		//System.out.println(s1==s2);//false
		//System.out.println(s3==s4);//false
		//System.out.println(s1==s5);//false
		System.out.println(s1.equals(s2));     //false
		System.out.println(s3.equals(s4));    //true
		System.out.println(s1.equals(s5));    //true

		System.out.println("=========================");
		String s6 = s1.toLowerCase();
		System.out.println(s6);
		String s7 = s1.toLowerCase();
		System.out.println(s7);
		char c = s1.charAt(0);
		System.out.println(c);

		boolean b = s1.equalsIgnoreCase("ANUPAma");
		System.out.println(b);
		
		System.out.println("=========================");
		StringBuffer sb = new StringBuffer("Manjunath");
		sb.append("XYZ");
		System.out.println(sb);q22
	}
}
