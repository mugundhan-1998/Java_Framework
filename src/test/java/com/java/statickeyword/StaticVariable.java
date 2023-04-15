package com.java.statickeyword;

public class StaticVariable {

	static int accountBalance;
	String name;
	
	StaticVariable(int bal, String name){
		accountBalance = bal;
		this.name = name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable person1 = new StaticVariable(1000,"David");
		
		StaticVariable person2 = new StaticVariable(2000,"John");
		System.out.println("the name is "+person1.name +" and the balance is "+ accountBalance);
		System.out.println("the name is "+person2.name +" and the balance is "+ accountBalance);   //static varidable belongs to an entire class instead of a instance of object
	}

}
