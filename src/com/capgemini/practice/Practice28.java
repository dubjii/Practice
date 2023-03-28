package com.capgemini.practice;
class Car{

	public static int count=1; 
	String [] a = new String[count];
	void akash() {
		for(int i = 0;i<count;i++) {
			a[i] = this.getColor();
			System.out.println(a[i]);
			
		}
	}
	private String name ;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
		count++;
	}
	
}
public class Practice28 {

	public static void main(String[] args) {

		Car obj = new Car("nano", "red");
		Car obj1 = new Car("tata","black");
		obj1.akash();
		//obj1.a;
		//obj.a;
	}

}
