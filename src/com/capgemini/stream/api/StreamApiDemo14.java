package com.capgemini.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
		String name;
		int id;
		char grade;
		public Student(String name,int id,char grade) {
			this.name = name;
			this.id = id;
			
			this.grade = grade;
			
		}
		
	}
public class StreamApiDemo14 {
	 public static void main(String[] args) {
		List<Student> studentList1 = new ArrayList<Student>();
		studentList1.add(new Student("smith",101,'a'));
		studentList1.add(new Student("jhon",102,'b'));
		studentList1.add(new Student("kenedysmith",103,'c'));
		List<Student> studentList2 = new ArrayList<Student>();
		studentList2.add(new Student("scott",104,'a'));
		studentList2.add(new Student("mary",105,'b'));
		studentList2.add(new Student("ketty",106,'c'));
		List<List<Student>> studentlist3 = Arrays.asList(studentList1,studentList2);
		// before stream concept
//		for(List<Student> s:studentlist3) {
//			for(Student stu:s) {
//				System.out.println(stu.name);
//			}
//		}
		// i want name of each student from studentlist3
		studentlist3.stream().flatMap(n->n.stream()).map(n-> n.name).forEach(System.out:: println);
	 }
}
