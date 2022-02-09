package com;

public class Employee {
	
	int age;
	String name;
	String color;	
	
	
	public Employee() {
		super();
	}
	
	
	public Employee(int age, String name, String color) {
		super();
		this.age = age;
		this.name = name;
		this.color = color;
	}


	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
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
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", color=" + color + "]";
	}
	
	
	
	
	

}
