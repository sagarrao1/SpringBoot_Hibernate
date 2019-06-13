package com.learning.Hibernate_Core;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Lapy {
	@Id
	private int lid;
	private String lname;	
	@ManyToOne
	private Alien alien;
		
	public Alien getAlien() {
		return alien;
	}
	
	public void setAlien(Alien alien) {
		this.alien = alien;
	}
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Lapy [lid=" + lid + ", lname=" + lname + "]";
	}
	
	
	
	
	
}
