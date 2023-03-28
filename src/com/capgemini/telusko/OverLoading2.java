		package com.capgemini.telusko;

		// topic 2 overloading
		// method overloading takes place in same class 
		// while method overriding takes place in different classes
		// here 2 add method having same name but different parameters(signature)
		// Method Signature is the combination of a method's name and its parameter list.
		//Yes, We can overload the main method in java but JVM only calls the original main method,
		//it will never call our overloaded main method.
		// it call the main method having string argument
		// we can overload constructor also we often do that
		// in overloading we can have one method static another non static 
		//Compiler checks only method signature for overloading of methods not the visibility of methods.
		//we can override a method which is overloaded in super class.
		//One of the important property of java constructor is that it can not be final.
		//As we know, constructors are not inherited in java. 
		//Therefore, constructors are not subject to hiding or overriding.
		public class OverLoading2 { 
			public void add(int i,int j) { 
			/* method overloading is known as compile time polymorphsim in java
				while overriding is known as runtime polymorphism in java*/
		System.out.println(i+j);
			}
			public  static void add(int i,int j,int k) {// here static method 
		// so we can overload using static and non static method 
		System.out.println(i+j+k);
			}
			//	public int add(int i,int j,int k) {
				//	System.out.println(i+j+k);
				//	return i+j+k;
			// by changing return type we can not stop it by changing return type
	
			public static void main(String[] args){
		OverLoading2 obj = new OverLoading2();
		obj.add(2,3);
		obj.add(2,3,7);
		}
		}
