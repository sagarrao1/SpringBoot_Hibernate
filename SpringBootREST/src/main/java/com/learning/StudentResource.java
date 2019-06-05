package com.learning;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResource {
	
	@Autowired
	StudentRepository repo;

	@RequestMapping("students")
	public List<Student> getStudents(){
		
		List<Student> studs = (List<Student>) repo.findAll();		
		/*
		 * Student s1= new Student(); s1.setId(101); s1.setName("Sagar");
		 * s1.setPoints(90);
		 * 
		 * Student s2= new Student(); s2.setId(102); s2.setName("Preethi");
		 * s2.setPoints(60);
		 * 
		 * studs.add(s1); studs.add(s2);
		 * 
		 */
		return studs;
	}
	
}
