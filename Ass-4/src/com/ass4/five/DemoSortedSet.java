package com.ass4.five;


import java.util.SortedSet;
import java.util.TreeSet;

public class DemoSortedSet {

	public static void main(String[] args) {
		
	SortedSet set = new TreeSet();
		
		set.add(" Kolhapur");
		set.add(" Sangli");
		set.add(" Satara");
		set.add(" Pune");
		set.add(" Ahamadnagar");
		set.add(" Nashik");
		set.add(" Solapur");
		set.add(" Mumbai");
		set.add(" Ratnagiri");
	
	     for (Object sort : set) {  
             System.out.println(sort);  
               }  

	}

}
