package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	List<Topic> topics= Arrays.asList(new Topic("spring","spring framwork","spring framwork description"),
									  new Topic("java","core java ","description core java"),
									  new Topic("hibernate","hibernate jpa","hiber description"));
	
	public List<Topic> getAllTopics(){
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

}
