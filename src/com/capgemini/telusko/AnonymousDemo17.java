			package com.capgemini.telusko;
			interface A7 {// we can not create object of interface
				void show();// methods in interface are public abstract
				}
			public class AnonymousDemo17 {
				public static void main(String[] args) {
					A7 obj = new A7() {/*
				* here we created object of interface using anonymous class  *and providing its
				* implementation  */			
			public void show() {
				System.out.println("hi i am the best");
			}
					};
					obj.show();
				}
			}
