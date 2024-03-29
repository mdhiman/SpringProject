package com.example.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndPoints {
	
	@RequestMapping("/mypage")
	public String myString() {
		return "My first example";
	}
	@RequestMapping("/second")
	public String sayHello(@RequestParam String name) {
		return "Hello " + name;
		
		
	}
	@RequestMapping("/secondpathvar/{name}")
	public String sayHello2(@PathVariable String name) {
		return "Hello pathvar :" + name;
		
		
	}
	@GetMapping(path = "/secondSampleBean")
	public SecondSampleBean secondSampleBean() {
		return new SecondSampleBean("Pojo Method Calls");
	}

}
