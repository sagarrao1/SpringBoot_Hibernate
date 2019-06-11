package com.learning.Hibernate_Core;

import javax.persistence.Embeddable;

@Embeddable
public class StudentName {
	private String fname;
	private String lname;
	private String mname;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	@Override
	public String toString() {
		return "StudentName [fname=" + fname + ", lname=" + lname + ", mname=" + mname + "]";
	}
	
	
}
