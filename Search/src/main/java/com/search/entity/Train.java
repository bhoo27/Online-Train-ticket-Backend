package com.search.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "search")
public class Train {
	
  @Id
	long id;
	
	String trainNumber;
	String origin;
	String destination;
	String trainDate;
	

	public Train(long id, String trainNumber, String origin, String destination, String trainDate) {
		super();
		this.id = id;
		this.trainNumber = trainNumber;
		this.origin = origin;
		this.destination = destination;
		this.trainDate = trainDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTraintNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTrainDate() {
		return trainDate;
	}

	public void setTrainDate(String trainDate) {
		this.trainDate = trainDate;
	}

	
	
}
