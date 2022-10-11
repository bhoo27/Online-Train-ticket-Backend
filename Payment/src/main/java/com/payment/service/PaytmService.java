package com.payment.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.entity.Paytm;
import com.payment.repostitory.PaytmRepository;

@Service
public class PaytmService {
	@Autowired
	public PaytmRepository repository;

	public Paytm dopay(Paytm paytm) {
		
		paytm.setTxId(UUID.randomUUID().toString());
		return repository.save(paytm);
	}

	

	public List<Paytm> findAll() {
		return repository.findAll();
	}



	public void deleteById(String id) {
		repository.deleteById(id);
	}

}
