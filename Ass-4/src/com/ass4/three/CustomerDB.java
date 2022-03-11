package com.ass4.three;

import java.util.HashMap;
import java.util.Map;

public class CustomerDB {
	
	static Map<Integer, Customer> db;
	static {
		db = new HashMap<Integer, Customer>();
		db.put(100, new Customer(100, "Mayuri", "Noida",10 ));
		db.put(101, new Customer(101, "Rohit", "Banglore",20 ));
		db.put(102, new Customer(102, "Nikita", "Gurgaon",30 ));
		db.put(103, new Customer(103, "Rahul", "Banglore",40));
		db.put(104, new Customer(104, "Paras", "Pune",50));
		db.put(105, new Customer(105, "Abhishek", "Pune",60));
		db.put(106, new Customer(106, "Pratik", "Banglore",70));
		db.put(107, new Customer(107, "Shubham", "Mumbai",50));
		db.put(108, new Customer(108, "Rakesh", "Mumbai",70));
		db.put(109, new Customer(1009, "Vinod", " Gurgaon",80));
	}

}
