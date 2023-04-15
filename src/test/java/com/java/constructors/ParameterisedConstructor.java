package com.java.constructors;

public class ParameterisedConstructor {

	String name;
	int number;
	Integer num;
	
	public ParameterisedConstructor(String name, int number, Integer num){
		  this.name = name; 
		  this.number = number; 
		  this.num = num;  
		  System.out.println("this is para con");
		  }
	public ParameterisedConstructor() {
		name = "python"; 
		  number = 51; 
		  num = 21;
	}
	public void ParameterisedConstructor(String name, int number, Integer num){
		  this.name = name; 
		  this.number = number; 
		  this.num = num;  
		  System.out.println("this is para method");
		  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterisedConstructor con = new ParameterisedConstructor();
		System.out.println("The value of variable name is "+ con.name);
		System.out.println("The value of variable number is "+ con.number);
		System.out.println("The value of variable num is "+ con.num);
		
		con.ParameterisedConstructor("java",5,100);
		System.out.println("The value of variable name is "+ con.name);
		System.out.println("The value of variable number is "+ con.number);
		System.out.println("The value of variable num is "+ con.num);
		
		ParameterisedConstructor con1 = new ParameterisedConstructor("python", 200, 500);
		System.out.println("The value of variable name is "+ con1.name);
		System.out.println("The value of variable number is "+ con1.number);
		System.out.println("The value of variable num is "+ con1.num);
	}

}
