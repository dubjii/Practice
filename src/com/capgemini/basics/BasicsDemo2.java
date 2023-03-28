package com.capgemini.basics;

public class BasicsDemo2 {
		// Arithmetic operators are +, -, * /,% ,++,--,=
			// decision making operator == ,!=,<,>,>=,<=,&& and operator (all true then true) 
	// || or operator( both false then only false)
		// % this modulus operator is used to find reminder
			/*The key difference between && and & operators is that && supports
			short-circuit evaluations while & operator does not. 
			Another difference is that && will evaluate the expression exp1, 
			and immediately return a false value if exp1 is false.*/
	public static void main(String[] args) {
		int div = 12/4;
		int mod = 12%3;
		System.out.println(div);/// o/p is 3
		System.out.println(mod);// o/p 0 as reminder is 0
		int x= 10;
		System.out.println(x++);// out put is 10
		System.out.println(x);// 11 
		System.out.println(++x);// 12 
		System.out.println(x--);// 12
		System.out.println(x);// 11
		System.out.println(--x);// 10
		int ageofboy  = 21;
		int ageofgirl = 18;
		//if ((ageofboy >=21 )&(ageofgirl >=18)) this can also be used
		if ((ageofboy >=21 )&&(ageofgirl >=18)) {
			System.out.println("they can get married ");
		}else {
			System.out.println("they can not get married ");
		}
		
	}

}
