package com.learning.Hibernate_Core;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Alien {
	@Id
	private int aid;
	private String aname;
	private int marks;

	@OneToMany(mappedBy = "alien", fetch = FetchType.EAGER)
	private List<Lapy> laps= new ArrayList<Lapy>();
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	
	public List<Lapy> getLaps() {
		return laps;
	}
	public void setLaps(List<Lapy> laps) {
		this.laps = laps;
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	/*
	 * @Override public String toString() { return "Alien [aid=" + aid + ", aname="
	 * + aname + ", marks=" + marks + "]"; }
	 */
	
	
	
	
	

}
