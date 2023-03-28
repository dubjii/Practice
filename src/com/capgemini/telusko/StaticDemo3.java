		package com.capgemini.telusko;
     	// topic 3
      	//topic third static keyword
		// static keyword is non access modifier 
		// to asses static variable we do not need object
		// we can use static with class level variable no use it with local variable
		// we can make method static static block static with inner class(nested class) not with outer class
		//static variable belongs to class not object
		//static is used for memory management
		// static method belongs to class not object so  no need of object 
		// before jdk 1.6 we were able to execute static block without main method but after 1.6 we can
		// not do that
		// static variable gets memory in class or method area and all objects share that 
		// static block executed first
		//Static methods are bonded at compile time using static binding.
		//Therefore, we cannot override static methods in Java.
		// reason of above is static binding
		//we can create static classes in java but those classes must be inner classes not outer one 
		// In static class, we can easily create objects.
 		// we can make a method static using static keyword  
		// we  can  inherit static class 
		//The static blocks always execute first before the main() method in Java 
		//because the compiler stores them in memory at the time of class loading 
		//and before the object creation. Here, the compiler executes all the static blocks first, 
		//and after finishing the static block execution, it invokes the main() method.
		//The static keyword means the value is the same for every instance of the class.
		//The final keyword means once the variable is assigned a value it can never be changed.
		// static block executes automatically no need to call
		// we can create multiple static block
//		What is method hiding? Method hiding can be defined as, 
//		"if a subclass defines a static method with the same signature as a static method"
//		+ " in the super class, in such a case, the method in the subclass hides the one in the superclass."
//		 "" The mechanism is known as method hiding.
		// we can override static method of parent class with static method of child class this concept 
		// is known as method hiding not method overriding
		class Emp{
		int eid;
		int salary;// to call static method we do not need object ex main method.
		 static String ceo ;
		 static {
			 System.out.println("hi you");
			 ceo="larry";
		 }
		 static {
			 ceo = "larry";
			 //we can use static block to initialize the static variable as it loads only once
			 System.out.println("hi its me");
			 // static block runs only once as is is part of class loader
		 }
		 public void show() {
			System.out.println(eid +":"+salary + ":"+ ceo); 
			System.out.println("hi its you");// it runs 2 times as it runs after each object
		 }
	 	}
	 	public class StaticDemo3 {
	 		public static void main(String[] args) {
			Emp akash = new Emp();
			Emp vinit = new Emp();
			akash.eid =1;
			akash.salary = 2000;
			//akash.ceo = "mahesh";
			vinit.eid =2;
			vinit.salary = 3000;
			//vinit.ceo = "rajesh";
			//Emp.ceo ="rakesh";
			// we can use class name instated of object as we are using static keyword
			akash.show();
			vinit.show();
			// static method can access only static data it can not call a non static method
	 		}
	 		}
	
