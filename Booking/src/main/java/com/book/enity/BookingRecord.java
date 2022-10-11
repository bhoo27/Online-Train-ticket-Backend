package com.book.enity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="BookingRecords")
public class BookingRecord {
	
	@Id
	String id;
    
    private String trainNumber;
    private String origin;
    private String destination;
    private String trainDate;
    private String bookingDate;
	
//    public BookingRecord() {
//		super();
//	}

	public BookingRecord(String id, String trainNumber, String origin, String destination, String trainDate,
			String bookingDate) {
		super();
		this.id = id;
		this.trainNumber = trainNumber;
		this.origin = origin;
		this.destination = destination;
		this.trainDate = trainDate;
		this.bookingDate = bookingDate;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
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

	public void settrainDate(String trainDate) {
		this.trainDate = trainDate;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	

}
