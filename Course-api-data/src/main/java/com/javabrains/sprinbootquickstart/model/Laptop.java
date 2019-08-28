package com.javabrains.sprinbootquickstart.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

	private int lid;
	private String brand;
	
	
		
	public Laptop() {
		System.out.println("Laptop object is created");
	}

	public Laptop(int lid, String brand) {
		super();
		this.lid = lid;
		this.brand = brand;
	}
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	
	public void compile() {
		System.out.println("in student compile method");
	}
	
	
}
