		package com.capgemini.telusko;
			interface Abc{
				 void show();
		}
			
		class Ba implements Abc{
			public void show() {
				System.out.println("reading interface");
			}
		}
		public class InterfaceDemo15 {
			public static void main(String[] args) {
				Abc obj = new Ba();
				obj.show();
			}
			}
