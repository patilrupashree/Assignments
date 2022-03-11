package com.ass4.one;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class LinedListDemo {

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
		
		
		
		System.out.println("   Iterator demo ");
		Iterator<String> itr = list.listIterator();
		
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println("Hi "+name);
		}
		
		System.out.println("   List Iterator demo   ");
		ListIterator<String> lstItr = list.listIterator();

		while (lstItr.hasNext()) {
			String name = lstItr.next();
			System.out.println("Hey " + name);
		}
		
		
		for (String name : list) {
			System.out.println("Hello " + name);
		}
		System.out.println("   Linked List Demo   ");
		System.out.println(list);

	}

}
