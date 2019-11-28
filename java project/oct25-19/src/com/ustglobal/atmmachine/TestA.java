package com.ustglobal.atmmachine;

public class TestA {
	public static void main(String[] args) {
		System.out.println("=====================");
		Machine m = new Machine();
		
		SBI sbi = new SBI();
		m.slot(sbi);
		System.out.println("======================");
		ICICI icici = new ICICI();
		m.slot(icici);
		System.out.println("======================");
		HDFC hdfc = new HDFC();
		m.slot(hdfc);
		System.out.println("======================");
	}
}
