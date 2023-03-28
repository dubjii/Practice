package com.capgemini.basics;

public class BasicsDemo5 {

	public static void main(String[] args) {
		String beverage = "cola";// we can use int char string and enum as a variable in switch case
		switch(beverage.toLowerCase()) {// we can not use float as a variable in switch case
		case "tea" : System.out.println("please bring me tea ");
		break;// break is applied to stop executing further cases after one case is satisfied
		
		case "water" : System.out.println("please bring me water ");
		break;
		case "cola" : System.out.println("please bring me cola ");
		break;
		default : System.out.println("invalid entry ");
		break;
			
		}
		
	}

}
