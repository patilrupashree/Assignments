package com.ass2.q2;

public class Triangle extends Figure {

	int dim1;
	int dim2;
	double dim3 = 0.5;
	
	public Triangle(int dim1, int dim2) {
		super();
		this.dim1= dim1;
		this.dim2= dim2;
	}
	
	public double area() {
		return dim3* dim1* dim2;
	}
}

