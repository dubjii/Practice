package com.capgemini.kk;
		class Student{
				int rollno;// instance variable
				// rollno =34; wrong as assignment statements can not appear at class level
				// int id =9; it is ok but not above one
				String name;// by default value is null
				//The new keyword in Java instantiates a class by 
				double marks;
				
				
				//Student(){
//					kunal.name ="akash";
//					kunal.marks=09;
//					
//					kunal.rollno=23;
					
				//}
				//by the above way we have to give value to each object one by one but that is not good way
				// so we need some keyword to accesses every object
				// i want to put automatically kunal there 
				// so we need this keyword
				public Student(int rollno , double marks,String name ) {
					
					this.rollno = rollno;// here this will be replaced with kunal 
					//and for every object it will change
					// so this refers to current object
					// if you will make rahul object this will be replaced by rahul
					this.name = name;
					this.marks = marks;
					
				}
		}
			public class Lect1 {
	
			public static void main(String[] args) {
				Student kunal = new Student(12,98.9,"Akash");
				kunal.rollno =90;// using dot operator to link the instance variable with reference variable
				System.out.println(kunal.rollno);
			
				
	}
	}

