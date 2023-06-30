package com.java.polymorphism;

public class Abstraction_Child extends Abstraction_Parent{

	@Override
	public void education() {
	System.out.println("I want to pursue BE");
		
	}

	@Override
	public void job() {
		System.out.println("I want to work in a company");
		
	}

	public static void main(String[] args) {
		Abstraction_Parent ac = new Abstraction_Child();
		ac.education();
		ac.job();
	}
}
