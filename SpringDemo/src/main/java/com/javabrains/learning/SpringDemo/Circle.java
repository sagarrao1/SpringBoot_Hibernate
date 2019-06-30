package com.javabrains.learning.SpringDemo;

public class Circle implements Shape {
	
	private Point center;

	public void draw() {
		System.out.println("In circle draw method");
		System.out.println("get x : "+center.getX()+"get Y : "+center.getY()+" center :"+center);
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	
	

}
