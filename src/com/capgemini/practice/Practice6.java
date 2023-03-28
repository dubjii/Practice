package com.capgemini.practice;
		class A1{
			public void show(){
				System.out.println("hi i am learning overriding ");
			}
		}
		class B1 extends A1{
			@Override
			public void show() {
				super.show();
				System.out.println("hi am am in inheritated class B");
				
			}
		}
public class Practice6 {

	public static void main(String[] args) {
		B1 obj = new B1();
		obj.show();

	}

}
