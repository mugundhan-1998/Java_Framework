package com.java.polymorphism;

public class Overriding_Child extends Overriding_Parent{

	@Override
	public void myrule(){
		System.out.println("Go to school daily");
	}
	
	public void childmethod(){
		System.out.println("This is child method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding_Parent ch = new Overriding_Child();
		ch.myrule();
		
	}

}
