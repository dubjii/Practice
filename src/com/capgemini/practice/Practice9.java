package com.capgemini.practice;
		abstract class A5{
			public abstract void show();
			public void display() {
				
			}
		}
			class B5 extends A5{
				public void show() {
					
				}
			}
			
		
public class Practice9 {

	public static void main(String[] args) {
		
		A5 obj = new B5();
	}

}
