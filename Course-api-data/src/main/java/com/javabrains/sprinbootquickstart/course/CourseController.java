package com.javabrains.sprinbootquickstart.course;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	@RequestMapping("/topics/{topic_id}/courses")
	@GetMapping
	public List<Course> getAllCourses(@PathVariable String topic_id) {
		System.out.println("getAllCourses resource");
			return courseService.getAllCourses(topic_id);
	}
	
	@RequestMapping("/topics/{topic_id}/courses/{id}")
	@GetMapping
	public Course getCourse(@PathVariable() String id) {
			return courseService.getCourse(id);
	}
	
	@RequestMapping(method =RequestMethod.POST, value = "/topics/{topic_id}/courses")	
	public void addCourse(@RequestBody Course course,@PathVariable String topic_id) {
		System.out.println("addCourse POST");
			courseService.addCourse(course, topic_id);
	}
	
	@RequestMapping(method =RequestMethod.PUT, value = "/topics/{topic_id}/courses/{id}")	
	public void updateCourse(@RequestBody Course course, @PathVariable String topic_id) {
		System.out.println("update Course PUT");
			courseService.updateCourse(course,topic_id);
	}
	
	@RequestMapping(method =RequestMethod.DELETE, value = "/topics/{topic_id}/courses/{id}")	
	public void deleteTopic(@PathVariable String id) {
		System.out.println("delete topic reourse");
			courseService.deleteCourse(id);
	}

}
