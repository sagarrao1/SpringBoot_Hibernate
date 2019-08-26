package com.javabrains.sprinbootquickstart.topic;

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
public class TopicController {
	
	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	@GetMapping
	public List<Topic> getAllTopics() {
		System.out.println("getAllTopics resource");
			return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	@GetMapping
	public Topic getTopic(@PathVariable("id") String p_id) {
			return topicService.getTopic(p_id);
	}
	
	@RequestMapping(method =RequestMethod.POST, value = "/topics")	
	public void addTopic(@RequestBody Topic topic) {
		System.out.println("addtopic POST");
			topicService.addTopic(topic);
	}
	
	@RequestMapping(method =RequestMethod.PUT, value = "/topics/{id}")	
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		System.out.println("update topic PUT");
			topicService.updateTopic(id,  topic);
	}
	
	@RequestMapping(method =RequestMethod.DELETE, value = "/topics/{id}")	
	public void deleteTopic(@PathVariable String id) {
		System.out.println("delete topic reourse");
			topicService.deleteTopic(id);
	}

}
