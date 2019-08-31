package com.javabrains.sprinbootquickstart.repository;

import org.springframework.data.repository.CrudRepository;
import com.javabrains.sprinbootquickstart.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer>{	
	

}
