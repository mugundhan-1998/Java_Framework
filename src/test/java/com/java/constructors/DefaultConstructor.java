package com.java.constructors;

public class DefaultConstructor {

	String name;
	int number;
	Integer num;
	
	public void DefaultConstructor(){
		  name = "python"; 
		  number = 51; 
		  num = 21;  
		  }

	public static void main(String[] args) {
		DefaultConstructor con = new DefaultConstructor();
		System.out.println("The value of variable name is "+ con.name);
		System.out.println("The value of variable number is "+ con.number);
		System.out.println("The value of variable num is "+ con.num);
		con.DefaultConstructor();
		System.out.println("The value of variable name is "+ con.name);
		System.out.println("The value of variable number is "+ con.number);
		System.out.println("The value of variable num is "+ con.num);
	}
}
