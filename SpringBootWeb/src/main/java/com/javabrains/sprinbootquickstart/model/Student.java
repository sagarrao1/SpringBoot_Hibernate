package com.javabrains.sprinbootquickstart.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int id;
	private String name;
	private String technology;
		
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", technology=" + technology + "]";
	}

	
	

}
