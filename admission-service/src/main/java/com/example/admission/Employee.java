package com.example.admission;

public class Employee {
	private String Id;
	private String firstName;
	private String lastName;
	private String speciality;
	
	public Employee() {
		super();
	}

	public Employee(String id, String firstName, String lastName, String speciality) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.speciality = speciality;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", speciality="
				+ speciality + "]";
	}
	
	

}
