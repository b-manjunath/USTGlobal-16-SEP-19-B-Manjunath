package com.ustglobal.lambdaexpressions;

public class TestSquareInterface {
	public static void main(String[] args) {
		SquareInterface si = x->x*x;
		int value = si.square(4);
		System.out.println("Square is :"+value);
	}
}
