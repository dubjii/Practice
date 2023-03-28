package com.capgemini;


	  import java.util.Scanner;
	  import java.util.Arrays;
	  class MissingCharacter
	  {

	  public static void main(String[] args)
	  {
	  String str;

	  Scanner sc=new Scanner(System.in);
	  System.out.println("please enter your string");
	  
	  str=sc.nextLine();
	  char ch[]=str.toLowerCase().toCharArray();
	  Arrays.sort(ch);
	  int a=0;
	  for(int i=1;i<=ch.length-1;i++)
	  {
	  a=(int)ch[i]-(int)ch[i-1];
	  int l=(int)ch[i]-1;

	  while(a>1)
	  {
	  System.out.println((char)l--);
	  a--;
	  }
	  }
	  }
	  }


