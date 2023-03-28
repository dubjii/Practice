		package com.capgemini.telusko;
			@FunctionalInterface // we can use @FunctionalInterface anotation here
			// to bring functional programing feature in java we added lambda in java
			// in functional programing the data is stored in form of function and variable
			//in java it is class and object
			// lambda expression is anonymous function (name less function no return type no access modifier)
			// second objective is code optimization using lambda
			// Runnable is functional interface having only run method 
			// Callable only call method 
			// we need functional interface for lambda expression
			// lambda expression can be invoked by functional interface only
			interface A8{
			void show();//as only one abstract method so it is functional interface
			// it can have default and static method even after that it will be a
			// a functional interface as it have single public abstract method
			}	
			public class FunctionalInterfaceDemo18 {// it is a interface having one abstract method
			// if we know functional interface we can use lambda expression
				public static void main(String[] args) {
					/*lambda expression it is
					 * only possible with functional interface*/
					A8 obj = ()->System.out.println("hi  you i am the best");
					// here we have	provided implimentation of show method					
					obj.show();
				}
				}
