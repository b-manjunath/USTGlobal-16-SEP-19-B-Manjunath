package com.ustglobal.filehandling;

public class BuilderDesignPattern {
	public static void main(String[] args) {
     StringBuffer buffer = new StringBuffer()
    		 .append("hello ")
    		 .append("world");
     System.out.println(buffer);
     //hello
     //buffer.append("hello");
     //world
     //buffer.append("world")
	}
}
