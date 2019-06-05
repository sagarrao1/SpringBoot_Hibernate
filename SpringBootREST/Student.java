package com.learning.JAX_RS_starter;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private int id;
	private String name;
	private  int points;
	
	public String getName() {
		return name;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	public int getPoints() {
		return points;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", points=" + points + "]";
	}	
	
	

}
