package com.details.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="passengerDetails")
public class PassengerDetails {
	@Id
    String id;
    
    String firstName;
    String lastName;
    String gender;
    String nooftickets;
	public PassengerDetails(String id, String firstName, String lastName, String gender, String nooftickets) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.nooftickets=nooftickets;
	}
	public PassengerDetails() {
		super();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNooftickets() {
		return nooftickets;
	}
	public void setNooftickets(String nooftickets) {
		this.nooftickets = nooftickets;
	}
	
	
    
    

}
