package com.example.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class FirstServiceController {

	public FirstServiceController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("/name")
	public String getAddress() {
		return " Hi I am dhiman";
	}

}