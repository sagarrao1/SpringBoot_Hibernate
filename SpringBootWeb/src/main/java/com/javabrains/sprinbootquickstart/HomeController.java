package com.javabrains.sprinbootquickstart;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javabrains.sprinbootquickstart.model.Student;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public ModelAndView home(Student stud) {
		//String name=req.getParameter("name");
		System.out.println("Hi this is sysout and your name :"+stud);
		//HttpSession session=req.getSession();
		//session.setAttribute("name", myName);
		//return "home";
		ModelAndView mv= new ModelAndView();
		mv.addObject("obj",stud);
		mv.setViewName("home");
		return mv;
		
	}

}
