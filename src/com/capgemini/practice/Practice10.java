package com.capgemini.practice;
	class A7{
		private int rollno;
		public void setRollno(int r) {
			rollno = r;
		}
		void show() {
			System.out.println("hiii");
		}
		void show(int i) {
			
		}
	}
	class B7 extends A7{
		@Override
		void show () {
			super.show();
			System.out.println("hello");
			
		}
	}
public class Practice10 {

	public static void main(String[] args) {
		
		A7 obj = new B7();
		obj.show();
	}

}
