package com.example.second;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class SecondServiceController {

	public SecondServiceController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("/address")
	public String getAddress() {
		return " Hi from Bangalore";
	}

}
