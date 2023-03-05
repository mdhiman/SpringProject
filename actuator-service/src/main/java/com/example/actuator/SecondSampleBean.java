package com.example.actuator;

import org.springframework.lang.NonNull;

public class SecondSampleBean {
	private String message;
	@NonNull
	private String message1;
	
	public SecondSampleBean(String message) {
		super();
		this.message = message;
		this.message1 = message1;
	}
	

	public String getMessage1() {
		return message1;
	}


	public void setMessage1(String message1) {
		this.message1 = message1;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
