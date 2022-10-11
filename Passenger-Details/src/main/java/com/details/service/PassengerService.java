package com.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.details.entity.PassengerDetails;
import com.details.repository.PassengerRepository;

@Service
public class PassengerService {
	
	@Autowired
	private PassengerRepository PassengerRepo;

	public PassengerDetails save(PassengerDetails details) {
		return PassengerRepo.save(details);
	}

	
	public List<PassengerDetails> findAll() {
		return PassengerRepo.findAll();
	}


	public void delete(String id) {
		PassengerRepo.deleteById(id);
		
	}


	public Object getDetailsById(String id) {
		return PassengerRepo.findById(id);
	}
	

}
