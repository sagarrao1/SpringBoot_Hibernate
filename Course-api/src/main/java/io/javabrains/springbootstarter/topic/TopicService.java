package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	List<Topic> topics= new ArrayList<Topic>( Arrays.asList(new Topic("spring","spring framwork","spring framwork description"),
									  new Topic("java","core java ","description core java"),
									  new Topic("hibernate","hibernate jpa","hiber description")));
	
	public List<Topic> getAllTopics(){
		System.out.println("getAllTopics service");
		return topics;

	}
	
	public Topic getTopic(String id){
		for (Topic topic : topics) {
			if (topic.getId().equals(id)) {
				return topic;
			}
		}
		
		return null;
	}

	public void addTopic(Topic topic){
		System.out.println("topic adding to list");
		topics.add(topic);
		System.out.println("topic added");
	}
	
	public void updateTopic(String id, Topic topic){
		System.out.println("update topic");
		for (int i = 0; i < topics.size(); i++) {
			Topic t=  topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
			}
			
		}
	}
	
	public void deleteTopic(String id){		
		for (int i = 0; i < topics.size(); i++) {
			Topic t=  topics.get(i);
			if (t.getId().equals(id)) {
				topics.remove(i);
				System.out.println("deleted topic" +i);	
			}
			
			
		}
	}

}
