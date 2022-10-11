package com.payment.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.entity.Payment;
import com.payment.repostitory.PaymentRepository;
@Service
public class PaymentService {
	
	@Autowired
	public PaymentRepository repository;

	public Payment dopay(Payment payment) {
		
		payment.setTxId(UUID.randomUUID().toString());
		return repository.save(payment);
	}

	

	public List<Payment> findAll() {
		return repository.findAll();
	}
	
	public void delete(String id) {
		repository.deleteById(id);
	}



	public Object getPaymentBypassengerId(String passengerId) {
		return repository.findBypassengerId(passengerId);
	}

	
//	public Object getPaymentById(String passengerId) {
//		return repository.findById(passengerId);
//	}


}
