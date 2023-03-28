package com.capgemini.practice;
		class A4{
			void show() {
				System.out.println("A");
			}
		}
		class B4 extends A4{
			void show() {
				System.out.println("B");
			}
		}
		class C4 extends A4{
			void show() {
				System.out.println("C");
			}
		}
public class Practice7 {

	public static void main(String[] args) {
		A4 obj = new A4();
		obj.show();
			obj = new B4();
		obj.show();
		obj = new C4();
		obj.show();
	}

}
