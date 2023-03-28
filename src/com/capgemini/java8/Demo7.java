package com.capgemini.java8;

class A extends RuntimeException{
A(String msg){
super(msg);
}
}
public class Demo7{
public static void main(String[] args){
int age = 12;
try{
if(age<18){
throw new A("you can not vote");
}
}
catch(Exception e){
System.out.println(e);
}
}
}


