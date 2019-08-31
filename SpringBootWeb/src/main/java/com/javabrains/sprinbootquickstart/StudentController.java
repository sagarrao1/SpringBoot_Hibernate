package com.javabrains.sprinbootquickstart;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.javabrains.sprinbootquickstart.model.Student;
import com.javabrains.sprinbootquickstart.repository.StudentRepo;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo studRepository;
	
	@RequestMapping("/")
	public String Student() {	
				
		return "studentHome";
	}
	
	@RequestMapping("/addstudent")
	public String addStudent(Student stud) {
		
		studRepository.save(stud);		
		return "studentHome";
	}
		

	@RequestMapping("/getstudent")
	public ModelAndView getStudent(@RequestParam("id") Integer id) {		
		Student s1=studRepository.findById(id).orElse(new Student());		
		ModelAndView mv = new ModelAndView();		
		mv.addObject("student",s1);
		mv.setViewName("showStudent");
		return mv;		
		
	}

	
	@RequestMapping("/getstudents")
	public ModelAndView getStudents() {
		
		List<Student> studs= new ArrayList<Student>();
		studRepository.findAll().forEach(studs::add);
		
		for (Student student : studs) {
			System.out.println(student);
		}
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("");
		return mv;		
		
	}
	
	
	

}
