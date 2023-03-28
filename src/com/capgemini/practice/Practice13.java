package com.capgemini.practice;
	interface A10{
		void show();
		default void display() {
			System.out.println("hiii");
		}
	}
	class B10 implements A10{
		public void show() {
			System.out.println("hello jii");
		}
		public void display() {
			System.out.println("hii u");
		}
	}
public class Practice13 {

	public static void main(String[] args) {
		B10 obj = new B10();
		obj.display();
		obj.show();
	}

}
