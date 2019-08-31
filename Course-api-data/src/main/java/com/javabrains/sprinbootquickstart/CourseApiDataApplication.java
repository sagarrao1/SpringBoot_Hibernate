package com.javabrains.sprinbootquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.javabrains.sprinbootquickstart.model.Student;

@SpringBootApplication
public class CourseApiDataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(CourseApiDataApplication.class, args);
		
		Student s1= context.getBean(Student.class);
		s1.show();
		s1.getLaptop();

	}

}
