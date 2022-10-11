package com.payment.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="payment")
public class Payment {
	
	@Id
	
	private String paymentId;
	private String txId;
	private String name;
	private long cardNo;
	private int cvv;
	private double total;
	private String passengerId;
	public Payment() {
		super();
	}
	public Payment(String paymentId, String txId, String name, long cardNo, int cvv, double total, String passengerId) {
		super();
		this.paymentId = paymentId;
		this.txId = txId;
		this.name=name;
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.total = total;
		this.passengerId=passengerId;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	
	public String getTxId() {
		return txId;
	}
	public void setTxId(String txId) {
		this.txId = txId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}
	
	
	
	
}
