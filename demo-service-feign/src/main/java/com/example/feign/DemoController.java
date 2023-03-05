package com.example.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoController {

	public DemoController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/servicename")
	public String getServiceName() {
		return "Welcome : Oracle";
	}
	
	@GetMapping("/serviceaddress")
	public String getServiceAddress() {
		return "Welcome : Oracle- Bangalore OTH";
	}
	
	@GetMapping("/servicename")
	public String getServiceDetails() {
		return "Micro Service Session";
	}

}
