package com.javabrains.sprinbootquickstart.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabrains.sprinbootquickstart.topic.Topic;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topic_id){
		List<Course> courses= new ArrayList<>();		
		//return courseRepository.findByTopicId(topic_id); 
		courseRepository.findByTopicId(topic_id).forEach(courses::add);
		return courses;

	}
	
	public Course getCourse(String id){
		return courseRepository.findById(id).get();
		
	}

	public void addCourse(Course course, String topic_id){
		course.setTopic(new Topic(topic_id,"",""));		
		courseRepository.save(course);		
	}
	
	public void updateCourse(Course course,String topic_id){
		System.out.println("update course");
		course.setTopic(new Topic(topic_id,"",""));		
		courseRepository.save(course);		
	
	}
	
	public void deleteCourse(String id){		
		courseRepository.deleteById(id);
		
	}

}
