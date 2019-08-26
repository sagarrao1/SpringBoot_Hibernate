package com.javabrains.sprinbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;
	
	
	List<Topic> topics= new ArrayList<Topic>( Arrays.asList(new Topic("spring","spring framwork","spring framwork description"),
									  new Topic("java","core java ","description core java"),
									  new Topic("hibernate","hibernate jpa","hiber description")));
	
	public List<Topic> getAllTopics(){
		//System.out.println("getAllTopics service");
		//return courses;
		List<Topic> topics= new ArrayList<>();		
		topicRepository.findAll().forEach(topics::add);
		return topics;

	}
	
	public Topic getTopic(String id){
		/*
		 * for (Course topic : courses) { if (topic.getId().equals(id)) { return topic; }
		 * }
		 * 
		 * return null;
		 */
		return topicRepository.findById(id).get();
		
	}

	public void addTopic(Topic topic){
//		System.out.println("topic adding to list");
//		courses.add(topic);
//		System.out.println("topic added");
		topicRepository.save(topic);		
	}
	
	public void updateTopic(String id, Topic topic){
		System.out.println("update topic");
		/*
		 * for (int i = 0; i < courses.size(); i++) { Course t= courses.get(i); if
		 * (t.getId().equals(id)) { courses.set(i, topic); }
		 * 
		 * }
		 */	
		topicRepository.save(topic);	
	}
	
	public void deleteTopic(String id){		
/*		for (int i = 0; i < courses.size(); i++) {
			Course t=  courses.get(i);
			if (t.getId().equals(id)) {
				courses.remove(i);
				System.out.println("deleted topic" +i);	
			}
*/			
		topicRepository.deleteById(id);
		
	}

}
