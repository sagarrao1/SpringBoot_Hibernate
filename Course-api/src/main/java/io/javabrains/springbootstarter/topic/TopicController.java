package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	@GetMapping
	public List<Topic> getAllTopics() {
			return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	@GetMapping
	public Topic getTopic(@PathVariable("id") String p_id) {
			return topicService.getTopic(p_id);
	}
}
