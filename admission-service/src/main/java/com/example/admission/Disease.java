package com.example.admission;

public class Disease {
	
	private String Id;
	private String name;
	private String description;

	public Disease() {
		// TODO Auto-generated constructor stub
	}

	public Disease(String id, String name, String description) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Pathology [Id=" + Id + ", name=" + name + ", description=" + description + "]";
	}


	
	

}
