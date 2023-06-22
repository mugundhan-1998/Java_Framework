package com.java.polymorphism;

public class Overloading {

	//Same method name but different in the argument we pass into the method. Occurs in same class
	
	public void method1() {
		System.out.println("This method is passed without any argument");
	}

	public void method1(String a) {
		System.out.println("This method is passed with one argument with String datatype");
	}

	public void method1(int a) {
		System.out.println("This method is passed with one argument with int datatype");
	}

	public void method1(int b, int a) {
		System.out.println("This method is passed with two argument with int datatype");
	}
	
	public void method1(String b, int a) {
		System.out.println("This method is passed with two argument with string and int datatype");	
	}
	
	public void method1(int b, String a) {
		System.out.println("This method is passed with two argument with int and string datatype");	//order of argument is different when compared to above method
	}
}
