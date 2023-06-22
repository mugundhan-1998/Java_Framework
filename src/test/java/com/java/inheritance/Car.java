package com.java.inheritance;

public class Car {

	int wheels=4;
	int fuelCapacity;
	String companyName;
	
	
	public void engine() {
		System.out.println("Whenever engine is called, i supply power");
	}
	
	public static void main(String[] args) {
	Car car = new Car();
	car.engine();                      
}
}
