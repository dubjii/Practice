package com.capgemini.arrays;
		// this keyword is used to refer current class instance variable 
		//used to invoke current class method implicitly
		//this() can be used to invoke current class constructor
		// used to pass as an argument in method call
		// used to pass as an argument in constructor call
		//return the current class instance from the method
public class ThisUses {
	public ThisUses() {
		System.out.println("no argument constructor");
	}
	public ThisUses(int i) {
		this();// so when there will be call of parameterized constructor it this() will call  
		// the no parameterized constructor also
		System.out.println(" argument constructor");
	}
	void display() {
		System.out.println("hello");
	}
	void show() {
		display();// here i am calling display method it is same as this.display()
		// by default there is this is being used by compiler
		//so either use display or use this.display both are same
		
	}
	void m1(ThisUses t) {
		System.out.println("i am in m1 method");
	}
	void m2() {
		m1(this);// here i am passing this keyword as argument in the m1 method
		// op will be i am in m1 method 
	}

	public static void main(String[] args) {
		ThisUses t = new ThisUses(10);
		//no argument constructor
		//  argument constructor because of this() method
		
		t.show();// hello

	}

}
