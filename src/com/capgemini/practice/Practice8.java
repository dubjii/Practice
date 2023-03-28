package com.capgemini.practice;
	class Student{
		private int rollno;
		private String name;
		public void setRollNo(int rollno) {
			this.rollno = rollno;
		}
		public int getRollNO() {
			return rollno;
		}
		public void setName(String name) {
			this.name = name ;
			
		}
		public String getName() {
			return name;
			
		}
		
	}
public class Practice8 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setRollNo(90);
		s.setName("nitesh");
		System.out.println(s.getName());
		System.out.println(s.getRollNO());
		

	}

}
