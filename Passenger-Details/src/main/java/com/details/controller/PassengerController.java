package com.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.details.entity.PassengerDetails;
import com.details.service.PassengerService;
@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("passenger")
public class PassengerController {
	
	@Autowired
	private PassengerService passengerservice;
	
	@PostMapping("/")
	public PassengerDetails addDetails(@RequestBody PassengerDetails details) {
		return this.passengerservice.save(details);
	}

	@PutMapping("/{id}")
	public PassengerDetails updateDetails(@RequestBody PassengerDetails details) {
		return this.passengerservice.save(details);
	}

	@DeleteMapping("/{id}")
	public void deleteDetails(@PathVariable("id") String id) {
		this.passengerservice.delete(id);
	}
	
	@GetMapping("/{id}")
	public Object getDetails(@PathVariable("id") String id ) {
	return this.passengerservice.getDetailsById(id);
	}
	

	@GetMapping("/")
	public List<PassengerDetails> getDetails() {
		return this.passengerservice.findAll();
	}


}
