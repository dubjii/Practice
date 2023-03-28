		package com.capgemini.telusko;
			// abstract = define +declare methods
			// interface = only declare method till 1.7
			// but in java 1.8 we can define methods in java
			@FunctionalInterface
			// here even after including default method it is a functional interface
			interface Demo{
				void abc();// here we have two methods one is abstract  other is default it 
				//also works like functional interface so 
				default void show () {
				// here we defined a method in interface using default keyword
					System.out.println("learning interfaces");
				}
			}
			class DemoImp implements Demo{
				public  void abc() {
				 System.out.println("learning interface 2");
			}
			public void show() {
				// we can override default method 
				// here we have used public while overriding default method
				System.out.println("hi you");// we can override the default method of interface
			}
		}
			public class FunctionalInterfaceDemo19 {
				public static void main(String[] args) {
					Demo obj = new DemoImp();
					obj.abc();
					obj.show();
				}
				}
