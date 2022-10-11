package com.payment.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="paytm-payment")
public class Paytm {
	
	@Id
	private String id;
	private long mobileNo;
	private int pin;
	private String txId;
	private double amount;
	private String passengerId;
	public Paytm(String id, long mobileNo, int pin, String txId, double amount, String passengerId) {
		super();
		this.id = id;
		this.mobileNo = mobileNo;
		this.pin = pin;
		this.txId = txId;
		this.amount = amount;
		this.passengerId=passengerId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getTxId() {
		return txId;
	}
	public void setTxId(String txId) {
		this.txId = txId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}
	

}
