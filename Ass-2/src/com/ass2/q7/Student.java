package com.ass2.q7;

public class Student extends Faculty {
	   public String branch;
	   public int Student_id;

	   public Student(String name, int age, String branch, int Student_id){
	   super(name, age);
	      this.branch = branch;
	      this.Student_id = Student_id;
	   }
	   public void displayStudent() {
	      System.out.println("Data of the Student: ");
	      System.out.println("Name: "+super.name);
	      System.out.println("Age: "+super.age);
	      System.out.println("Branch: "+this.branch);
	      System.out.println("Student ID: "+this.Student_id);
	   }
}
