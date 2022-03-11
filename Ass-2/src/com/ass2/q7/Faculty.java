package com.ass2.q7;

public class Faculty {
	public String name;
	public int age;

	public Faculty(String name, int age){

		this.name = name;
		this.age = age;
	}

	public void displayPerson() {
		System.out.println("Data of the Faculty: ");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}
}
