package com.ass2.q2;

public class Rectangle extends Figure{

	int dim1;
	int dim2;
	
	public Rectangle(int dim1, int dim2) {
		this.dim1= dim1;
		this.dim2= dim2;
			
	}
	
	public double area() {
		return dim1*dim2;
	}
}
