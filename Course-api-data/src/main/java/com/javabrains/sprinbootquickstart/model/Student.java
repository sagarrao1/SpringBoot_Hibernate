package com.javabrains.sprinbootquickstart.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String name;
	private String technology;
	
	@Autowired
	private Laptop laptop;
		
	public Student() {
		System.out.println("student object created");
	}
	
	public Student(int id, String name, String technology) {
		super();
		this.id = id;
		this.name = name;
		this.technology = technology;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public void show() {
		System.out.println("in student show() method");
		laptop.compile();
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", technology=" + technology + "]";
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	

}
