package com.capgemini.practice;
		
 public  class Practice2 {
	int rollno;
	float marks;
	static  String ceo;
	
	static{
		System.out.println("hi its mohnish the updater ");
		ceo = "akash";
		ceo = "nilesh";
	}
	
	

	public static void main(String[] args) {
		Practice2 p = new Practice2();
		Practice2.ceo="umesh";
		System.out.println(p.ceo);
		
		Practice2 p1 = new Practice2();
		System.out.println(p1.ceo);
		
	}

}
