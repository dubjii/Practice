package com.capgemini.practice;
	class Outer{
		void show() {
			
		}
		static class Inner{
			void display() {
				System.out.println("hi man ");
			}
		}
	}
public class Practice17 {

	public static void main(String[] args) {
		Outer obj = new Outer();
		Outer.Inner obj1 = new Outer.Inner();
		obj1.display();
	}

}
