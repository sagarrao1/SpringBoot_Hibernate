package com.javabrains.learning.SpringDemo;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape  /* implements InitializingBean,DisposableBean */ {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	//ApplicationContext context=null;
	
	
	/*
	 * public List<Point> getPoints() { return points; } public void
	 * setPoints(List<Point> points) { this.points = points; }
	 */

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
 
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public void draw() {
		System.out.println("draw method of triangle");
		System.out.println( "PointA = "+getPointA()+", PointB = "+pointB +" PointC = "+getPointC());
		
		/*
		 * for (Point point : points) { System.out.println(point); }
		 */
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println(" Initialized bean method has been called in Triangle");
		
	}

	public void destroy() throws Exception {
		System.out.println(" destroy bean method has been called in Triangle");
		
	}
	
	public void myInit() {
		System.out.println(" myInit Initialized bean method has been called in Triangle");
	}
	
	public void myCleanup() {
		System.out.println(" myCleanup Initialized bean method has been called in Triangle");
	}

	/*
	 * public void setApplicationContext(ApplicationContext context) throws
	 * BeansException { this.context=context;
	 * 
	 * } public void setBeanName(String name) {
	 * System.out.println("Bean Name : "+name);
	 * 
	 * }
	 */

}
