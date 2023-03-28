package com.capgemini.basics;

class Car {

	private String doors;// these are class attributes
	private String engine;// here private is an access modifier in java
	private String driver;
	private int speed;
	// The private modifier specifies that the member can only be accessed in its
	// own class.

	// generating getters and setter of members(fields) of car class
	// we need getters and setter to bind the field data with methods
	/*
	 * the variables must be private and the method is public so here we are binding
	 * data with method so this is known as encapsulation(making capsules) use for
	 * security reasons also binding data with methods is known as encapsulaton
	 */
	// setter method to set(give) the data
	// getter method to get(take )data
	public void setSpeed(int speed) {
		this.speed = speed;//The this keyword refers to the current object in a method or constructor.
		//The most common use of the this keyword is to eliminate the confusion between class attributes 
		//and parameters with the same name 
		//(because a class attribute is shadowed by a method or constructor parameter).
		// if we do not create constructor there will be a default constructor
		// if we create it java will not create default constructor
	}

	public int getSpeed() {
		return speed;
	}
}

public class BasicsDemo12 {

	public static void main(String[] args) {
			Car car = new Car();
			car.setSpeed(30);
			System.out.println(car.getSpeed());
	}

}