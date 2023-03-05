package com.bvr.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cars")
public class Car {

	private String id;
	private String make;
	private String year;
	private String model;
	private String description;
	
	public Car() {
		
	}

	public Car(String id, String make, String year, String model, String description) {
		super();
		this.id = id;
		this.make = make;
		this.year = year;
		this.model = model;
		this.description = description;
	}

	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
