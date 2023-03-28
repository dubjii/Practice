package com.capgemini.collection;
		// demo 15 ,16 , 17,  18 combined hai to teeno ko sath me pado
		// the natural sorting order means accending order 
		// you can also go to practice 29 30 for same stuff
		// sort method works only  those who extends or implements Comparable interface 
		// learn about generic method from selenium express 
		// content ke liye learn code with durgesh ka Comparable vs Comparator dekh lo
		// tabhi samjh ayega mast se  
		// it is present in java.lang package and it contains only one method comapreTo() 
		//Comparable interface is used when we want to compare objects using one of there property 
		// it is considered a natural sorting of objects 
		// 
	class Emp implements Comparable<Emp>{// here i have implemented Comparable interface as i want to use 
		// single sorting logic
		
		// here by <Emp> i told that i want to compare Emp class 
		private String name;
		private String phone;
		private int empid;
		
		@Override
		public int compareTo(Emp o) {// it is method of Comparable interface 
			
			return this.empid-o.empid;
			// here this.o is object which we are trying to insert 
			// and here o.empid is already present object
			//-ve ehen current object is lesser than the specified object
			// if this returns -ve means obj1 has to come before obj2
			// +ve integer if current object is greater than the specified object
			// if this returns +ve means obj1 has to come after obj2
			// if 0 then obj1 = obj2 equal
			
			// yha pe ye current object ke empid se dusare object ke employee id ko compare karega 
			// aur ye increasing id wise sort kar dega 
		}
		// upar wali method (Comparable ki method ) ke sath problem 
		//ye hai ki isme sirf ek hi logic lga sakte hai
		// it can be either with id or name or phone 
		// to remove this problem we use Comparator
		
//		public void  setName(String name) {
//			this.name = name;
//		}
//		public String getName() {
//			return name;
//		}
//	}
		public Emp(String name, String phone , int empid) {
			this.name = name;
			this.phone = phone;
			this.empid = empid;
			
		}
	
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public int getEmpid() {
			return empid;
		}

		public void setEmpid(int empid) {
			this.empid = empid;
		}

		@Override
		public String toString() {
			return "Emp [name=" + name + ", phone=" + phone + ", empid=" + empid + "]";
		}

		
		
	}

public class CollectionDemo15 {

	public static void main(String[] args) {
		
		
	}

}
