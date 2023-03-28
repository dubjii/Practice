package com.capgemini.programingquestions;

import java.util.HashMap;

import java.util.Map;
public class frequncyofanoinArray22 {
	 public static void main(String args[]) {
	        Map<Integer ,Integer> m = new HashMap<Integer ,Integer>();
	    Integer [] a = {1,2,3,3,4,4,4,5};
	    for(Integer i: a){
	     if(m.containsKey(i)){
	         m.put(i,m.get(i)+1);
	     }
	     else{
	         m.put(i,1);
	     }
	   
	    } 
	    System.out.println(m);
	    }
}
