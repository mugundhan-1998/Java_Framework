package com.java.statickeyword;

public class StaticMethod {

	static void method1() {
		System.out.println("This is a static method");
	}
	
void nonstatic() {
	System.out.println("This is a non static method");
	method1();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod sm = new StaticMethod();
		sm.nonstatic();
		method1();
	}

}
