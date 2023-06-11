package com.java.typecasting;

public class TypeCasting {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 5;    //byte can store from -127 to +127
		int a;
		byte c;
		int d = 120;
		a=b;    //In implicit typecasting, the conversion involves a smaller data type to the larger type size. For example, the byte datatype implicitly typecast into short, char, int, long, float, and double.
		System.out.println("the value of a is "+ a );
		
		c=(byte)d;   //Explicit typecasting
		System.out.println("the value of c is "+ c );
	
	}

}
