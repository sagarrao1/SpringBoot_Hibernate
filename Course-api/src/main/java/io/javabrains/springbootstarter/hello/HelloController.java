package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	@GetMapping
	public String sayHi() {
		return "Hi Sagar";
	}
}
