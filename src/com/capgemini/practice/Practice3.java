package com.capgemini.practice;
		
		class Outer{
			public void display() {
				System.out.println("hi i am in outer class");
			}
			class Inner {
				public void show() {
					System.out.println("hi i am in inner class ");
				}
			}
		}
		
		
		
		
public class Practice3 {

	public static void main(String[] args) {
		
			Outer obj = new Outer();
			obj.display();
			Outer.Inner obj1 = obj.new Inner();
			obj1.show();
	}

}
