package com.ass4.four;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
	List<String> list = new LinkedList<>();
		
	list.add("Mayuri");
	list.add("Rohit");
	list.add("Nikita");
	list.add("Rahul");
	list.add("Paras");
	list.add("Abhishek ");
	list.add("Pratik ");
	list.add("Shubham ");
	list.add("Rakesh");
	
		
		
		  Collection.sort(list,(a, b) -> a.name.compareToIgnoreCase(b.name));
	        System.out.println(list);

	}

}
