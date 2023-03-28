package com.capgemini.arrays;
class A{
	int a= 10;
	void m1() {
		System.out.println("i am in m1 method");
	}
}
class B extends A{
	int a = 20;
	public void show(int a) {
		System.out.println(a);//30
		System.out.println(this.a);// 20
		System.out.println(super.a);// 10
		// super refers the immediate parent class
		// super is used when there is concept of inheritance
		// this and super both are reference variable but this is for current 
		// class while super is for the parent class 
		super.m1();// this will call the m1 method of class A 
		// o/p is i am in m1 method 
		
	}
	
}
public class SuperUses {
	// super keyword is used to refer immediate parent class instance variable
	// used to invoke immediate parent class method 
	// used to invoke immediate parent class constructor
	// super is keyword while super() is used call the constructor of parent class 
	public static void main(String[] args) {
	B obj = new B();
	obj.show(30);

	}

}
