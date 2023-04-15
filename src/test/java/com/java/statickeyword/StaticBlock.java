package com.java.statickeyword;

public class StaticBlock {

	static int number;
	
	static {
		System.out.println("this is the static block 1");
		number=28;
		System.out.println("number is "+number);
	}
	static {
		System.out.println("this is the static block 2");
	}
	StaticBlock() {
		System.out.println("No argument constructor");
		number = 20;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock sb = new StaticBlock();
		System.out.println("number is "+sb.number);
	}

}
