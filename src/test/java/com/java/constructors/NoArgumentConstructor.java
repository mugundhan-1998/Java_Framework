package com.java.constructors;

public class NoArgumentConstructor {

	String name;
	int number;
	Integer num;

	public NoArgumentConstructor() {
		name = "java";
		number = 5;
		num = 2;
	}

	public void NoArgumentConstructor() {
		name = "python";
		number = 51;
		num = 21;
	}


	public static void main(String[] args) {
		NoArgumentConstructor con = new NoArgumentConstructor(); 
		System.out.println("The value of variable name is "+ con.name);
						 
		System.out.println("The value of variable number is "+ con.number); 
								
		System.out.println("The value of variable num is "+ con.num);
		
	con.NoArgumentConstructor();
				System.out.println("The value of variable name is "+ con.name);
				System.out.println("The value of variable number is "+ con.number);
				System.out.println("The value of variable num is "+ con.num);
		}
	
}
