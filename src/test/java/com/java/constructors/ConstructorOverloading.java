package com.java.constructors;

public class ConstructorOverloading {
	String name;
	int number;
	Integer num;
	public ConstructorOverloading(String name, int number, Integer num){
		  this.name = name; 
		  this.number = number; 
		  this.num = num;  
		  System.out.println("this is parameterised constructor with three arguments");
		  }
	public ConstructorOverloading(String name, int number){
		  this.name = name; 
		  this.number = number;   
		  System.out.println("this is parameterised constructor with two arguments");
		  }
	public ConstructorOverloading() {
		name = "python"; 
		  number = 51; 
		  num = 21;
		  System.out.println("This is no arguement");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading con = new ConstructorOverloading("john",3);
		ConstructorOverloading con1 = new ConstructorOverloading("john",3,200);
		ConstructorOverloading con2 = new ConstructorOverloading();

	}

}
