package com.capgemini.telusko;

	// first topic of telusko 
	// object knows something with help of variables object does something it does 
	//something with help of method
	// method have return type
	// main method is first line that gets executed
	//main method must be public otherwise it will get compiled but not executed
	// to call any method in java we need object but in case of main we do not have object as
	// execution starts from main itself so we make method static
	// constructor have same name as class name no return type 
	//constructor can  not be final and static 
	//Constructors are not members, so they are not inherited by subclasses,
	//but the constructor of the superclass can be invoked from the subclass
	// when 2 methods have same name but different parameters(signature) that is method overloading 
	// method overloading takes place in same class 
	//Default Constructor (Non-parameterized Constructor)
	//Parameterized Constructor
	// we can not make outer class private as will not be visible to compiler
	// but we can make our inner class private
	public class Calc1 {
	int num1;		// instance variable
	int num2;		// instance variable
	int result;		// instance variable
	
//	public void perform() {
//		result = num1+num2;
//	}1
	// the calling of method will depend upon the passing of arguments
	// default constructor will be called automatically when we create an object
//	}
	public   Calc1(int num1, int num2) {      // Initializing the value of object through constructor
			 this.num1 = num1;
			 this.num2 = num2;
			// this keyword
		// local variable shadows instance variable 
		// there is no default value of local variable thats why we have assign some value to them
		//when instance variable and local variable have same name then by using 
		// this keyword we tell this variable is instance variable not local one
		//if we have different variable name it is not needed to do so
		// this refers to current object
	}
	public  static void main(String[]  args) {
		Calc1 obj = new Calc1(5, 6);// here obj is just a reference
		// new will create the object and how much memory it will take
		// this ans will be given by constructor
		// here Calc1() is constructor it do not have a return type
		// constructor is method which have same name as class name
		// we can make our constructor private 
		// there will be default constructor
		//we can use constructor to initialize the value of object
		// obj = 3 this is not how we can provide value to object
		obj.num1 = 2;
		obj.num2 = 3;
//		obj.perform();// calling the method
		System.out.println(obj.result);
	}

}
