package com.capgemini.collection;

import java.util.function.Predicate;
class Employee{
	String name;
	int salary;
	int experience;
	public Employee(String name,int salary,int expeience) {
		this.name = name;
		this.salary = salary;
		this.experience= experience;
	}
}
public class PredicatesDemo1 {

	public static void main(String[] args) {
		// we are using even and odd no using Predicate Functions test method  
		Predicate<Integer> obj = (t)->(t%2 ==0);
		
		System.out.println(obj.test(30));
		// finding if string length is greater than 4 
		Predicate <String > p1 = (str)-> str.length()>=4;
		System.out.println(p1.test("manish"));// true
		// print array elements whose size is greater than 4
		String[] names= {"manish","rahul","you","ravi"};
		
			for(String name:names) {
				if(p1.test(name)) {
					System.out.println(name);//manish// rahul// 	ravi
				// i need list of all employess having salry greater than 30000 and experience greater than 3
					Employee emp = new Employee("akash",38000,5);
					Employee emp1 = new Employee("aka",35000,5);
					Employee emp2= new Employee("akh",30000,5);
					Employee emp3= new Employee("kash",28000,6);
					Predicate<Employee> pr = e-> (e.salary>30000 && e.experience>3);
					System.out.println(pr.test(emp));
				
				}
			}
	}
	

}