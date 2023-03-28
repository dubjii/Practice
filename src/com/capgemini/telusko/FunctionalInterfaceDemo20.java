		package com.capgemini.telusko;
		// static method in interface that is also feature of java8 
		// in interface we can have static method default method and abstract method 
			interface Demo1{
				int num = 5;
			
				// we can have variable in interface but it becomes a constant 
				//because there is final keyword by default.  
				void abc();
				static void show() {
					// it is feature of java 8 that we can declare a static method in interface.
					//we can have abstract method we can have static default method in interface
					System.out.println("hii");
				}
			}
				public class FunctionalInterfaceDemo20 {
					public static void main(String[] args) {
						Demo1.show();
					// as to call static method we do not need object	
					}
					}
