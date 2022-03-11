package com.ass.four;

public class AccessStatic {
	//static variables
	public static String company="Publicis Sapient";
	public static String name="Rupashree";
	public static int pincode=568201;
	
	public void ordinaryMethod() {
		System.out.println(company+" : "+name+" : "+pincode);
	}
	public static void main(String[] args) {
		AccessStatic as=new AccessStatic();
		as.ordinaryMethod();
		 

}
}
