package com.ustglobal.lambdaexpressions;

public class TestFactory {
public static void main(String[] args) {
	FactorialInterface fi = (n)->{
		int fact = 1;
		for(int i=2;i<=n;i++) {
			fact = fact*i;
		}
		return fact;
	};
	int factToatl
}
}
