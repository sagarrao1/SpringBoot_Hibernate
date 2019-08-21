package io.javabrains.springbootstarter.topic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	@GetMapping
	public String getAllTopics() {
		return "All Topics";
	}
}
